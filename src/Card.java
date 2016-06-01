/**
 * Created by L on 28.05.2016.
 */
public class Card {

    private int pin = 1234;
    private boolean isActivate;



    public Card() {

        setActivate(true);
    }

    public Card setPin(int pin) {
        this.pin = pin;
        return this;
    }

    public int getPin() {
        return pin;
    }

    public Card setActivate(boolean activate) {
        isActivate = activate;
        return this;
    }

    public boolean isActivate() {
        return isActivate;
    }
}
