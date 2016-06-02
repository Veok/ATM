package ATM.ATMState.States;

import ATM.ATM;
import ATM.ATMState.ATMState;
import ATM.Card.Card;

/**
 * Created by L on 28.05.2016.
 */
public class HasCard implements ATMState {

    private ATM atm;
    private Card card;

    public HasCard(ATM atm, Card card) {
        this.atm = atm;
        this.card = card;

    }


    @Override
    public void ejectCard() {
        System.out.println("Twoja karta zostałą wydana");
        atm.setAtmState(atm.getNoCard());
    }

    @Override
    public void insertCard() {
    }

    @Override
    public void enterPin(int pin, int i) {


        if (pin == card.getPin()) {


            System.out.println("Podałeś prawidłowy nr PIN");
            card.setCorrectPin(true);
            atm.setAtmState(atm.getEnteredCorrectPin());


        } else if (i < 3) {
            System.out.println("Nieprawidłowy nr PIN");
            System.out.println("*****");
            System.out.println("Podaj numer PIN");
        } else if (i == 3) {
            card.setActivate(false);
            atm.setAtmState(atm.getNoCard());
            atm.getNoCard().insertCard();
        }
    }

    @Override
    public void requestCash(int cash) {
    }
}
