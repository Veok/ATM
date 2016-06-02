package ATM.Card;

/**
 * Created by L on 28.05.2016.
 */
public class Card {

    private boolean isActivate;
    private boolean correctPin;


    public Card() {

        setActivate(true);
        setCorrectPin(false);
    }

    public int getPin() {
        return 1234;
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
