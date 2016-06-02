import ATM.ATM;
import ATM.Menu.ATMMenu;

/**
 * Created by L on 28.05.2016.
 */
public class Szmallenium {

    public static void main(String[] args) {

        /** Pin do karty = 1234 */
        ATM atm = new ATM();
        atm.getCard().setActivate(true);
        atm.setATMBlocked(false);
        ATMMenu menu = new ATMMenu();
        menu.menu(atm);
    }
}
