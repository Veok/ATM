/**
 * Created by L on 28.05.2016.
 */
public class NoCash implements ATMState {


private ATM atm;

    public NoCash(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void ejectCard() {
        System.out.println("No Cash in Machine. ATM BLOCKED");
    }

    @Override
    public void insertCard() {
        System.out.println("No Cash in Machine. ATM BLOCKED");
        atm.ejectCard();

    }

    @Override
    public void enterPin(int pin, int i) {
        System.out.println("No Cash in Machine. ATM BLOCKED");
        atm.ejectCard();

    }

    @Override
    public void requestCash(int cash) {
        System.out.println("No Cash in Machine. ATM BLOCKED");
        atm.ejectCard();

    }
}
