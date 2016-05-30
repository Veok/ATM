/**
 * Created by L on 28.05.2016.
 */
public class HasCard implements ATMState {

    private ATMState atmState;

    public HasCard(ATMState atmState) {
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
        System.out.println("Pin already entered");
    }

    @Override
    public void requestCash() {

    }
}
