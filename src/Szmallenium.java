import java.util.Scanner;

/**
 * Created by L on 28.05.2016.
 */
public class Szmallenium {

    public static void main(String[] args) {

        ATM atm = new ATM();
        atm.getCard().setActivate(true);
        atm.setATMblocked(false);


        Scanner in = new Scanner(System.in);
        int userChoice;
        boolean quit = false;

        do {


            System.out.println("*********SZMALLENIUM ATM*********");
            System.out.println("Wciśnij 1 aby włożyć kartę");
            System.out.println("Wciśnij 0 aby wyjść");
            System.out.println("*********************************");

            userChoice = in.nextInt();

            switch (userChoice) {
                case 1: {
                    int i = 0;
                    int pin;

                 if(atm.isATMblocked()){
                System.out.println("BANKOMAT ZABLOKOWANY");
                  }
                   else
                     atm.insertCard();

                    if (atm.getCard().isActivate()) {
                        do {

                            if (atm.getCard().isCorrectPin()) {
                                break;
                            } else {
                                i++;
                                pin = in.nextInt();
                                atm.enterPin(pin, i);
                            }


                        } while ((i < 3));


                        if (atm.getCard().isActivate()) {
                            int cash;
                            System.out.println("Podaj kwotę jaką chcesz wypłacić: ");

                            cash = in.nextInt();
                            atm.requestCash(cash);
                            if (cash > atm.getCashInATM()) {
                                System.out.println("Czy chcesz wypłacić proponowaną sumę pieniędzy?");
                                System.out.println("1 - Tak, 2 - Nie");
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
                    } else {
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


        } while (!quit);


    }



}
