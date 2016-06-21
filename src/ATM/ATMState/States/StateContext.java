package ATM.ATMState.States;

import ATM.ATMState.ATMState;

/**
 * Created by L on 11.06.2016.
 */
public class StateContext {


    private ATMState currentState;

    public StateContext(ATMState currentState) {
        this.currentState = currentState;
    }

    public void ejectCard() {
        this.currentState = currentState.ejectCard();
    }

    public void insertCard() {
        this.currentState = currentState.insertCard();
    }

    public void enterPin(int pin, int i) {
        this.currentState = currentState.enterPin(pin, i);
    }

    public void requestCash(int cash) {
        this.currentState = currentState.requestCash(cash);
    }
}
