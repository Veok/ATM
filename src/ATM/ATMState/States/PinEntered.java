package ATM.ATMState.States;

import ATM.ATM;
import ATM.ATMState.ATMState;
import ATM.Card.Card;

/**
 * Created by L on 28.05.2016.
 */
public class PinEntered implements ATMState {

    private ATM atm;
    private Card card;


    PinEntered(ATM atm, Card card) {
        this.atm = atm;
        this.card = card;
    }

    @Override
    public ATMState ejectCard() {
        System.out.println("Twoja karta została wydana");
        return new NoCard(atm, card);
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

        /** Jesli zadana kwota do wyplaty bedzie ponizej zera, oraz jesli zostanie wyplacona prawidlowa kwota
         to nastepuje przejscie do stanu NoCard.
         * Wyplacenie calej gotowki z atm ustawia stan NoCash, a bankomat zostaje zablokowany
         */

        atm.getCard().setCorrectPin(false);
        if (cash > atm.getCashInATM()) {
            System.out.println("Bankomat nie posiada zadanej sumy pieniędzy");
            int newCash = atm.getCashInATM();
            System.out.println("Możliwa suma pieniędzy do wypłaty: " + newCash);

        } else {
            if (cash <= 0) {

                System.out.println("Podałeś nieprawidłową kwotę do wypłaty");
                System.out.println("Karta została wyciągnięta");
                return new NoCard(atm, card);
            } else {
                System.out.println("Wypłacono " + cash + " zł");
                atm.setCashInATM(atm.getCashInATM() - cash);
                System.out.println("Karta została wyciągnięta");
                if (this.atm.getCashInATM() <= 0) {
                    this.atm.setATMBlocked(true);
                    return new NoCash(atm, card);
                }
            }
        }
        return this;
    }


}
