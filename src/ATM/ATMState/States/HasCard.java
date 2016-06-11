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

    HasCard(ATM atm, Card card) {
        this.atm = atm;
        this.card = card;

    }


    @Override
    public ATMState ejectCard() {
        System.out.println("Twoja karta zostałą wydana");
        return new NoCard(atm, card);
    }

    @Override
    public ATMState insertCard() {
        throw new IllegalStateException();

    }

    @Override
    public ATMState enterPin(int pin, int i) {

        /** Jesli zadany pin jest zgodny z nr pin karty, to nastepuje zmiana stanu na PinEntered.
         * Jesli przekazana zmienna 'i' bedzie rowna 3, to nasepuje blokada karty i ustawienie stanu atm na NoCard
         */
        if (pin == card.getPin()) {


            System.out.println("Podałeś prawidłowy nr PIN");
            card.setCorrectPin(true);
            return new PinEntered(atm, card);

        } else if (i < 3) {
            int j = i + 1;
            System.out.println("Nieprawidłowy nr PIN.");
            System.out.println("*****");
            System.out.println("Podaj numer PIN. Próba " + j + " z 3");
        } else if (i == 3) {
            card.setActivate(false);
            System.out.println("Przekroczona ilość prób wpiania nr pin");
            System.out.println("KARTA ZABLOKOWANA");
            return new NoCard(atm, card);
        }

        return this;
    }

    @Override
    public ATMState requestCash(int cash) {
        throw new IllegalStateException();

    }
}
