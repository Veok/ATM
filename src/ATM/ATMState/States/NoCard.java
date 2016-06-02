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
    public void ejectCard() {}

    @Override
    public void insertCard() {
        if (card.isActivate()) {
            System.out.println("****");
            System.out.println("Podaj numer PIN");
            atm.setAtmState(atm.getHasCard());
        } else {
            System.out.println("*********************************");
            System.out.println("KARTA ZABLOKOWANA");
            atm.getHasCard().ejectCard();
            System.out.println("*********************************");

        }
    }

    @Override
    public void enterPin(int pin, int i) {}

    @Override
    public void requestCash(int cash){}
}
