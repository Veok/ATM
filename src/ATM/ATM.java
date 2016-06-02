package ATM;

import ATM.ATMState.ATMState;
import ATM.ATMState.States.HasCard;
import ATM.ATMState.States.NoCard;
import ATM.ATMState.States.NoCash;
import ATM.ATMState.States.PinEntered;
import ATM.Card.Card;

/**
 * Created by L on 30.05.2016.
 */
public class ATM {

    private ATMState hasCard;
    private ATMState noCard;
    private ATMState enteredCorrectPin;
    private ATMState NoCash;
    private ATMState atmState;
    private Card card;
    private boolean ATMBlocked;


    private int cashInATM = 40000;

    public ATM() {

        card = new Card();
        hasCard = new HasCard(this, card);
        noCard = new NoCard(this, card);
        enteredCorrectPin = new PinEntered(this);
        NoCash = new NoCash(this);

        atmState = noCard;

        if (cashInATM < 0) {
            atmState = NoCash;
        }


    }

    public ATM setCashInATM(int cashInATM) {
        this.cashInATM = cashInATM;
        return this;
    }

    public Card getCard() {
        return card;
    }

    public int getCashInATM() {
        return cashInATM;
    }

    public ATM setAtmState(ATMState atmStatel) {
        this.atmState = atmStatel;
        return this;


    }

    public void insertCard() {
        atmState.insertCard();
    }

    public void ejectCard() {
        atmState.ejectCard();
    }

    public void enterPin(int pin, int i) {
        atmState.enterPin(pin, i);
    }


    public boolean isATMBlocked() {
        return ATMBlocked;
    }

    public ATM setATMBlocked(boolean ATMBlocked) {
        this.ATMBlocked = ATMBlocked;
        return this;
    }

    public void requestCash(int cash) {
        atmState.requestCash(cash);
    }

    public ATMState getHasCard() {
        return hasCard;
    }

    public ATMState getNoCard() {
        return noCard;
    }

    public ATMState getEnteredCorrectPin() {
        return enteredCorrectPin;
    }

    public ATMState getNoCash() {
        return NoCash;
    }
}
