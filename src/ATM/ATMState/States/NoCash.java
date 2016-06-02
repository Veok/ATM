package ATM.ATMState.States;

import ATM.ATM;
import ATM.ATMState.ATMState;

/**
 * Created by L on 28.05.2016.
 */
public class NoCash implements ATMState {


    private ATM atm;

    public NoCash(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void ejectCard() {
        if (!atm.isATMBlocked()) {
            atm.setAtmState(atm.getHasCard());
        } else
            System.out.println("\n*********************************");
            System.out.println("BRAK PIENIĘDZY W BANKOMACIE");
            System.out.println("BANKOMAT ZABLOKOWANY");
             System.out.println("*********************************");

    }

    @Override
    public void insertCard() {}

    @Override
    public void enterPin(int pin, int i) {}

    @Override
    public void requestCash(int cash) {}
}
