/**
 * Created by L on 28.05.2016.
 */
public class HasCard implements ATMState {


    private ATM atm;
    private Card card;

    public HasCard(ATM atm, Card card) {
        this.atm = atm;
        this.card = card;
    }



    @Override
    public void ejectCard() {
        System.out.println("Your Card is ejected");
        atm.setAtmStatel(atm.getNoCard());
    }

    @Override
    public void insertCard() {
        System.out.println("Card already inserted");
    }

    @Override
    public void enterPin(int pin) {
        if(pin == 1234){
            System.out.println("You've entered correct pin");
//            card.setActivate(true);
            atm.setAtmStatel(atm.getEnteredCorrectPin());
        }
        else{
            System.out.println("Wrong pin");
            card.setActivate(false);
            atm.setAtmStatel(atm.getNoCard());
        }
    }

    @Override
    public void requestCash(int cash) {
        System.out.println("You've not entered a pin");
    }
}
