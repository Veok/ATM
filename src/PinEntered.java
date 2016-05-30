/**
 * Created by L on 28.05.2016.
 */
public class PinEntered implements ATMState {

    private ATMState atmState;

    public PinEntered(ATMState atmState) {
        this.atmState = atmState;
    }

    @Override
    public void ejectCard() {
    }

    @Override
    public void insertCard() {
        System.out.println("Card already inserted");

    }

    @Override
    public void enterPin() {
        System.out.println("You already entered a Pin");
    }

    @Override
    public void requestCash() {

    }
}
