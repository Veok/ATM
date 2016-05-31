/**
 * Created by L on 28.05.2016.
 */
public class Szmallenium {

    public static void main(String[] args) {
        Card card = new Card(1234);
        card.setPin(1234);
        ATM atm = new ATM();
        atm.insertCard();
        atm.ejectCard();
        atm.insertCard();
        atm.enterPin(1234);
        atm.requestCash(400005);


    }
}
