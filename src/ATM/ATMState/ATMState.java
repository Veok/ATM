package ATM.ATMState;

/**
 * Created by L on 28.05.2016.
 */
public interface ATMState {

    void insertCard();

    void ejectCard();

    void enterPin(int pin, int i);

    void requestCash(int cash);
}