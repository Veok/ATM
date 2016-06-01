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
    public void enterPin(int pin, int i)
    {

        System.out.println("Prosze czekac");


    }

    @Override
    public void requestCash(int cash) {
        if(cash > atm.getCashInATM()){
            System.out.println("Bankomat nie posiada zadanej sumy pieniędzy");
            newCash =atm.getCashInATM();
            System.out.println("Możliwa suma pieniędzy do wypłaty: " + newCash);

        }
        else{
            System.out.println(cash + " wypłacono");
            atm.setCashInATM(atm.getCashInATM() - cash);
            System.out.println("Karta została wyciągnięta");
            atm.setAtmStatel(atm.getNoCard());
            if(atm.getCashInATM() <=0){
                atm.setAtmStatel(atm.getNoCash());
            }
        }

    }
}
