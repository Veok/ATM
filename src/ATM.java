/**
 * Created by L on 30.05.2016.
 */
public class ATM {

    private ATMState hasCard;
    private ATMState noCard;
    private ATMState enteredCorrectPin;
    private ATMState NoCash;
    private ATMState atmStatel;
    private Card card;



    private int CashInATM = 40000;

    public ATM() {
        card = new Card();
        hasCard = new HasCard(this,card);
        noCard = new NoCard(this);
        enteredCorrectPin = new PinEntered(this);
        NoCash = new NoCash(this);

        atmStatel = noCard;

        if(CashInATM < 0 ){
            atmStatel = NoCash;
        }
    }

    public ATM setCashInATM(int cashInATM) {
        CashInATM = cashInATM;
        return this;
    }

    public Card getCard() {
        return card;
    }

    public int getCashInATM() {
        return CashInATM;
    }

    public ATM setAtmStatel(ATMState atmStatel) {
        this.atmStatel = atmStatel;
        return this;


    }
    public void insertCard(){
        atmStatel.insertCard();
    }

    public void ejectCard(){
        atmStatel.ejectCard();
    }

    public void enterPin(int pin){
        atmStatel.enterPin(pin);
    }

    public void requestCash(int cash){
        atmStatel.requestCash(cash);
    }

    public  ATMState getHasCard(){return hasCard;}
    public  ATMState getNoCard(){return  noCard;}
    public ATMState getEnteredCorrectPin() {return  enteredCorrectPin;}
    public  ATMState getNoCash(){return  NoCash;}
}
