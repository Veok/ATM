package ATM.ATMState.States;

import ATM.ATM;
import ATM.ATMState.ATMState;
import ATM.Card.Card;

/**
 * Created by L on 28.05.2016.
 */
public class NoCard implements ATMState {


    private ATM atm;
    private Card card;

    public NoCard(ATM atm, Card card) {
        this.atm = atm;
        this.card = card;
    }

    @Override
    public ATMState ejectCard() {
        throw new IllegalStateException();

    }

    @Override
    public ATMState insertCard() {

        /** Jesli karta jest aktywna, to nastepuje zmiana stanu atm na HasCard. */

        if (card.isActivate()) {
            System.out.println("****");
            System.out.println("Podaj numer PIN");
            return new HasCard(atm,card);
        } else {
            System.out.println("*********************************");
            System.out.println("KARTA ZABLOKOWANA");
            System.out.println("*********************************");
            return this;

        }
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
