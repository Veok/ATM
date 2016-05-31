/**
 * Created by L on 28.05.2016.
 */
public class NoCard implements ATMState {


private ATM atm;

    public NoCard(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void ejectCard() {

        System.out.println("No card in machine");
    }

    @Override
    public void insertCard() {
        System.out.println("Enter pin");
        atm.setAtmStatel(atm.getHasCard());
    }

    @Override
    public void enterPin(int pin) {
        System.out.println("You've not entered pin");

    }

    @Override
    public void requestCash(int cash) {
        System.out.println("You must insert card first");
    }
}
