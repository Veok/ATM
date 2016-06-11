package ATM.Menu;

import ATM.ATM;
import ATM.ATMState.States.StateContext;

import java.util.Scanner;

/**
 * Created by L on 02.06.2016.
 */
public class ATMMenu {

    public void menu(ATM atm, StateContext stateContext) {


        Scanner in = new Scanner(System.in);
        int userChoice;
        boolean quit = false;

        do {


            System.out.println("\n*********SZMALLENIUM ATM*********");
            System.out.println("Wciśnij 1 aby włożyć kartę");
            System.out.println("Wciśnij 0 aby wyjść");
            System.out.println("*********************************");

            userChoice = in.nextInt();

            switch (userChoice) {
                case 1: {


                    /** sprawdzenie statusu bankomatu (brak pieniedzy = blokada) */
                    if (atm.isATMBlocked()) {
                        System.out.println("\n*********************************");
                        System.out.println("BRAK PIENIĘDZY W BANKOMACIE");
                        System.out.println("BANKOMAT ZABLOKOWANY");
                        System.out.println("*********************************");
                    } else {

                        stateContext.insertCard();
                        CardInserted cardInserted = new CardInserted();
                        cardInserted.insertCard(atm, stateContext);
                        break;
                    }
                    continue;
                }
                case 0: {
                    quit = true;
                    System.out.println("Dowidzenia!");
                    break;
                }
            }
        }
        while (!quit);
    }

}

