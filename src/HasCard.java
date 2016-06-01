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
        System.out.println("Your Card is ejected");
        atm.setAtmStatel(atm.getNoCard());
    }

    @Override
    public void insertCard() {
        System.out.println("Card already inserted");
    }

    @Override
    public void enterPin(int pin, int i) {


        if (pin == card.getPin()) {


            System.out.println("Podałeś prawidłowy nr PIN");
            card.setCorrectPin(true);
            atm.setAtmStatel(atm.getEnteredCorrectPin());


        } else if (i < 3) {
            System.out.println("Nieprawidłowy nr PIN");
            System.out.println("*****");
            System.out.println("Podaj numer PIN");
        } else if (i == 3) {
            card.setActivate(false);
            atm.setAtmStatel(atm.getNoCard());
            atm.getNoCard().insertCard();
        }
    }


    @Override
    public void requestCash(int cash) {
        System.out.println("You've not entered a pin");
    }
}
