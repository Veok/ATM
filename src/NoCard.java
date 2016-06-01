/**
 * Created by L on 28.05.2016.
 */
public class NoCard implements ATMState {


private ATM atm;
    private Card card;

    public NoCard(ATM atm, Card card) {
        this.atm = atm;
        this.card = card;
    }

    @Override
    public void ejectCard() {

        System.out.println("No card in machine");
    }

    @Override
    public void insertCard() {
        if(card.isActivate()){
        System.out.println("Podaj nr PIN");
        atm.setAtmStatel(atm.getHasCard());}
        else{
            System.out.println("KARTA ZABLOKOWANA");
            atm.getHasCard().ejectCard();
        }
    }

    @Override
    public void enterPin(int pin, int i) {
        System.out.println("You've not entered pin");


    }

    @Override
    public void requestCash(int cash) {
        System.out.println("You must insert card first");
    }
}
