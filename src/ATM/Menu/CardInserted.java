package ATM.Menu;

import ATM.ATM;

import java.util.Scanner;

/**
 * Created by L on 02.06.2016.
 */
class CardInserted {

    void insertCard(ATM atm) {


        if (atm.getCard().isActivate()) {
            pinChecker(atm);
            if (atm.getCard().isActivate()) {
                CashRequested cashRequested = new CashRequested();
                cashRequested.requestCash(atm);
            }
        }
    }

    private void pinChecker(ATM atm) {

        int i = 0;
        int pin;
        Scanner in = new Scanner(System.in);

        do {
            if (atm.getCard().isCorrectPin()) {
                break;
            } else {
                i++;
                pin = in.nextInt();
                atm.enterPin(pin, i);
            }
        } while ((i < 3));
    }
}
