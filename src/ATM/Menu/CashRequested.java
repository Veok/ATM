package ATM.Menu;

import ATM.ATM;
import ATM.ATMState.States.StateContext;

import java.util.Scanner;

/**
 * Created by L on 02.06.2016.
 */
class CashRequested {

    void requestCash(ATM atm, StateContext stateContext) {

        int cash;
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj kwotę jaką chcesz wypłacić: ");

        cash = in.nextInt();

        /** Wywolanie metody requestCash w klasie PinEntered */

        stateContext.requestCash(cash);

        if (cash > atm.getCashInATM()) {
            toMuchCash(atm,stateContext);
        }

    }

    private void toMuchCash(ATM atm,StateContext stateContext) {

        Scanner in = new Scanner(System.in);
        System.out.println("Czy chcesz wypłacić proponowaną sumę pieniędzy?");
        System.out.println("1 - Tak, 2 - Nie");
        System.out.println("****");

        int choice = in.nextInt();
        switch (choice) {
            case 1: {
                stateContext.requestCash(atm.getCashInATM());
            }
            case 2: {
                stateContext.ejectCard();
            }
        }
    }
}
