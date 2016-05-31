/**
 * Created by L on 28.05.2016.
 */
public class PinEntered implements ATMState {

    private ATM atm;
    private int newCash;

    public PinEntered(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void ejectCard() {
        System.out.println("Your card is ejected");
        atm.setAtmStatel(atm.getNoCard());
    }

    @Override
    public void insertCard() {
        System.out.println("Card already inserted");

    }

    @Override
    public void enterPin(int pin)
    {
        System.out.println("You already entered a Pin");
    }

    @Override
    public void requestCash(int cash) {
        if(cash > atm.getCashInATM()){
            System.out.println("We dont have such cash in atm, do u wanna lowest?");
            newCash =atm.getCashInATM();
            System.out.println("We can offer u " + newCash);
            atm.setCashInATM(atm.getCashInATM() - newCash);
        }
        else{
            System.out.println(cash + "is withdrawn");
            atm.setCashInATM(atm.getCashInATM() - cash);
            System.out.println("Card is ejected");
            atm.setAtmStatel(atm.getNoCard());
            if(atm.getCashInATM() <=0){
                atm.setAtmStatel(atm.getNoCash());
            }
        }

    }
}
