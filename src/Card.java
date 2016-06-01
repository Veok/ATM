/**
 * Created by L on 28.05.2016.
 */
public class Card {

    private int pin = 1234;
    private boolean isActivate;
    private boolean correctPin;



    public Card() {

        setActivate(true);
        setCorrectPin(false);
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

    public boolean isCorrectPin() {
        return correctPin;
    }

    public Card setCorrectPin(boolean correctPin) {
        this.correctPin = correctPin;
        return this;
    }
}
