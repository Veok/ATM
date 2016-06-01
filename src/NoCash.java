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
        if(!atm.isATMblocked()){
            atm.setAtmStatel(atm.getHasCard());
        }
        else
        System.out.println("No Cash in Machine. ATM BLOCKED1");
       atm.getHasCard().ejectCard();



    }

    @Override
    public void insertCard() {
        if(!atm.isATMblocked()){
            atm.setAtmStatel(atm.getHasCard());
        }
        else

            System.out.println("No Cash in Machine. ATM BLOCKED2");
             atm.getHasCard().ejectCard();


    }

    @Override
    public void enterPin(int pin, int i) {
        if(!atm.isATMblocked()){
            atm.setAtmStatel(atm.getHasCard());
        }
        else
            System.out.println("No Cash in Machine. ATM BLOCKED3");
        atm.getHasCard().ejectCard();


    }

    @Override
    public void requestCash(int cash) {
        if(!atm.isATMblocked()){
            atm.setAtmStatel(atm.getHasCard());
        }
        else
            System.out.println("No Cash in Machine. ATM BLOCKED4");
        atm.getHasCard().ejectCard();


    }
}
