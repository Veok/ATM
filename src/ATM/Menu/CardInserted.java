package ATM.Menu;

import ATM.ATM;
import ATM.ATMState.States.StateContext;

import java.util.Scanner;

/**
 * Created by L on 02.06.2016.
 */
class CardInserted {

    void insertCard(ATM atm, StateContext stateContext) {


        if (atm.getCard().isActivate()) {
            pinChecker(atm, stateContext);
            if (atm.getCard().isActivate()) {
                CashRequested cashRequested = new CashRequested();
                cashRequested.requestCash(atm, stateContext);
            }
        }
    }

    private void pinChecker(ATM atm, StateContext stateContext) {

        /** Metoda sprawdzajaca zgodnosc wprowadzonego nr pin z nr pin karty */

        int i = 0;
        int pin;
        Scanner in = new Scanner(System.in);

        do {
            if (atm.getCard().isCorrectPin()) {
                break;
            } else {

                i++;
                pin = in.nextInt();

                /** Przekazanie zmiennej i oraz pin do  metody enterPin, klasy HasCard */

                stateContext.enterPin(pin, i);
            }
        } while ((i < 3));
    }
}
