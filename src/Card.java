/**
 * Created by L on 28.05.2016.
 */
public class Card implements IsActivate {

    private int pin;

    public Card(int pin) {
        this.pin = pin;
    }

    @Override
    public void doOperations() {

    }

    @Override
    public boolean isActivate() {
        return false;
    }


}
