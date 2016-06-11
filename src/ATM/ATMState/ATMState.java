package ATM.ATMState;

/**
 * Created by L on 28.05.2016.
 */
public interface ATMState {

    ATMState insertCard();

    ATMState ejectCard();

    ATMState enterPin(int pin, int i);

    ATMState requestCash(int cash);
}
