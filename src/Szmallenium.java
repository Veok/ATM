import ATM.ATM;
import ATM.ATMState.States.NoCard;
import ATM.ATMState.States.StateContext;
import ATM.Card.Card;
import ATM.Menu.ATMMenu;

/**
 * Created by L on 28.05.2016.
 * PIN do karty = 1234
 */
public class Szmallenium {

    public static void main(String[] args) {

        Card card = new Card();
        ATM atm = new ATM(card);
        /** aktywacja karty */
        atm.getCard().setActivate(true);
        /** wyłączenie blokady atm */
        atm.setATMBlocked(false);
        ATMMenu menu = new ATMMenu();
        StateContext stateContext = new StateContext(new NoCard(atm,card));
        menu.menu(atm, stateContext);
    }
}
