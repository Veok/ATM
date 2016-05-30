/**
 * Created by L on 28.05.2016.
 */
public class NoCash implements ATMState {

    private ATMState atmState;

    public NoCash(ATMState atmState) {
        this.atmState = atmState;
    }

    @Override
    public void ejectCard() {
        System.out.println("No Cash in Machine. ATM BLOCKED");
    }

    @Override
    public void insertCard() {
        System.out.println("No Cash in Machine. ATM BLOCKED");

    }

    @Override
    public void enterPin() {
        System.out.println("No Cash in Machine. ATM BLOCKED");

    }

    @Override
    public void requestCash() {
        System.out.println("No Cash in Machine. ATM BLOCKED");

    }
}
