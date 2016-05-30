/**
 * Created by L on 30.05.2016.
 */
public class ATM {

    private ATMState hasCard;
    private ATMState noCard;
    private ATMState EnteredCorrectPin;
    private ATMState NoCash;
    private ATMState atmStatel;
    private int CashInATM = 40000;
    private Card card;

    public ATM(ATMState atmStatel, Card card, int cashInATM, ATMState enteredCorrectPin, ATMState hasCard, ATMState noCard, ATMState noCash) {
        this.atmStatel = atmStatel;
        this.card = card;
        CashInATM = cashInATM;
        EnteredCorrectPin = enteredCorrectPin;
        this.hasCard = hasCard;
        this.noCard = noCard;
        NoCash = noCash;

        atmStatel = noCard;

        if(CashInATM < 0 ){
            atmStatel = NoCash;
        }
    }
}
