package ATM;

import ATM.Card.Card;

/**
 * Created by L on 30.05.2016.
 */
public class ATM {


    private Card card;
    private boolean ATMBlocked;

    /**
     * Gotowka w skrytce atm
     */
    private int cashInATM = 40000;

    public ATM(Card card) {

        this.card = card;

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

    public boolean isATMBlocked() {
        return ATMBlocked;
    }

    public ATM setATMBlocked(boolean ATMBlocked) {
        this.ATMBlocked = ATMBlocked;
        return this;
    }


}
