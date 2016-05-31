import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by L on 28.05.2016.
 */
public class Szmallenium {

    public static void main(String[] args) {

        ATM atm = new ATM();
        atm.getCard().setPin(1234);

        Scanner in = new Scanner(System.in);
        int userChoice;
        boolean quit = false;

        do{
            System.out.println("Press 1 to insert card");
            System.out.println("Press 0 to quit");

            userChoice = in.nextInt();

            switch(userChoice){
                case 1 : {atm.insertCard();
                    int pin;
                    pin = in.nextInt();
                    atm.enterPin(pin);
                    System.out.println("How many cash do you wanna withdraw?");
                    int cash;
                    cash = in.nextInt();
                    atm.requestCash(cash);
                    if(cash > atm.getCashInATM()){
                        System.out.println("do u wanna this money?");
                        System.out.println("1 - yes, 2 - no");
                        int choice = in.nextInt();
                        switch (choice){
                            case 1: {atm.requestCash(atm.getCashInATM());}
                            case 2: {atm.ejectCard();}
                        }

                    }
                            }
                case 2: {quit = true; break;}
            }



        }while(!quit);


    }
}
