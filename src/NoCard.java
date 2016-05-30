/**
 * Created by L on 28.05.2016.
 */
public class NoCard implements ATMState {

    private ATMState atmState;

    public NoCard(ATMState atmState) {
        this.atmState = atmState;
    }

    @Override
    public void ejectCard() {
        System.out.println("No card in machine");
    }

    @Override
    public void insertCard() {

    }

    @Override
    public void enterPin() {

    }

    @Override
    public void requestCash() {
        System.out.println("You must insert card first");
    }
}
