package ATM.Menu;

import ATM.ATM;

import java.util.Scanner;

/**
 * Created by L on 02.06.2016.
 */
class CashRequested {

    void requestCash(ATM atm) {

        int cash;
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj kwotę jaką chcesz wypłacić: ");

        cash = in.nextInt();


        atm.requestCash(cash);

        if (cash > atm.getCashInATM()) {
            toMuchCash(atm);
        }

    }

    private void toMuchCash(ATM atm) {

        Scanner in = new Scanner(System.in);
        System.out.println("Czy chcesz wypłacić proponowaną sumę pieniędzy?");
        System.out.println("1 - Tak, 2 - Nie");
        System.out.println("****");

        int choice = in.nextInt();
        switch (choice) {
            case 1: {
                atm.requestCash(atm.getCashInATM());
            }
            case 2: {
                atm.ejectCard();
            }
        }
    }
}
