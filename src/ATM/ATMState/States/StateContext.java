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
        ATMState newState = currentState.ejectCard();
        this.currentState = newState;
    }

    public void insertCard() {
        ATMState newState = currentState.insertCard();
        this.currentState = newState;
    }

    public void enterPin(int pin, int i) {
        ATMState newState = currentState.enterPin(pin, i);
        this.currentState = newState;
    }

    public void requestCash(int cash) {
        ATMState newState = currentState.requestCash(cash);
        this.currentState = newState;
    }
}
