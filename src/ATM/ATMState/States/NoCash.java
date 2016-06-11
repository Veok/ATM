package ATM.ATMState.States;

import ATM.ATM;
import ATM.ATMState.ATMState;
import ATM.Card.Card;

/**
 * Created by L on 28.05.2016.
 */
public class NoCash implements ATMState {


    private ATM atm;
    private Card card;

    NoCash(ATM atm, Card card) {
        this.atm = atm;
        this.card = card;
    }

    @Override
    public ATMState ejectCard() {
        if (!atm.isATMBlocked()) {
            return new HasCard(atm, card);
        } else
            System.out.println("\n*********************************");
        System.out.println("BRAK PIENIĘDZY W BANKOMACIE");
        System.out.println("BANKOMAT ZABLOKOWANY");
        System.out.println("*********************************");
        return this;
    }

    @Override
    public ATMState insertCard() {
        throw new IllegalStateException();

    }

    @Override
    public ATMState enterPin(int pin, int i) {
        throw new IllegalStateException();

    }

    @Override
    public ATMState requestCash(int cash) {
        throw new IllegalStateException();

    }
}
