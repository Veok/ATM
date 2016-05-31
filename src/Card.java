/**
 * Created by L on 28.05.2016.
 */
public class Card {

    private int pin;
    private boolean isActivate;


    public Card() {
    }

    public Card setPin(int pin) {
        this.pin = pin;
        return this;
    }

    public int getPin() {
        return pin;
    }

    public boolean isActivate() {
        return isActivate;
    }

    public Card setActivate(boolean activate) {
        isActivate = activate;
        return this;
    }
}
