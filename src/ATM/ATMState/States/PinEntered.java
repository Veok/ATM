package ATM.ATMState.States;

import ATM.ATM;
import ATM.ATMState.ATMState;

/**
 * Created by L on 28.05.2016.
 */
public class PinEntered implements ATMState {

    private ATM atm;


    public PinEntered(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void ejectCard() {
        System.out.println("Twoja karta została wydana");
        atm.setAtmState(atm.getNoCard());
    }

    @Override
    public void insertCard() {
    }

    @Override
    public void enterPin(int pin, int i) {
    }

    @Override
    public void requestCash(int cash) {

        atm.getCard().setCorrectPin(false);
        if (cash > atm.getCashInATM()) {
            System.out.println("Bankomat nie posiada zadanej sumy pieniędzy");
            int newCash = atm.getCashInATM();
            System.out.println("Możliwa suma pieniędzy do wypłaty: " + newCash);

        } else if(cash<=0){

            System.out.println("Podałeś nieprawidłową kwotę do wypłaty");
            System.out.println("Karta została wyciągnięta");
            atm.setAtmState(atm.getNoCard());
        }
         else {
            System.out.println("Wypłacono " + cash + " zł");
            atm.setCashInATM(atm.getCashInATM() - cash);
            System.out.println("Karta została wyciągnięta");
            atm.setAtmState(atm.getNoCard());
            if (atm.getCashInATM() <= 0) {
                atm.setATMBlocked(true);
                atm.setAtmState(atm.getNoCash());

            }
        }

    }
}
