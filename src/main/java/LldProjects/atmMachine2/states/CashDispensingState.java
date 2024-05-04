package LldProjects.atmMachine2.states;

import LldProjects.atmMachine2.card.Card;
import LldProjects.atmMachine2.ATM;
import LldProjects.atmMachine2.card.CardManager;

public class CashDispensingState implements State{


    private ATM atm;

    public CashDispensingState(ATM atm) {
        this.atm = atm;
    }

    @Override
    public String init(String machineId) {
        throw new IllegalStateException();
    }

    @Override
    public void readCard(Card card, String transId) {

    }

    @Override
    public void readWithdrawalDetails(int amount, String transId) {

    }

    @Override
    public void cashDispense(String transId) {
        CardManager cardManager = new CardManager();
        cardManager.executeTransaction(transId);
        // dispense cash.
        // go to the ejecting state
        this.atm.changeState(StateName.CARD_EJECTING);
    }

    @Override
    public void ejectCard() {
    }

    @Override
    public StateName getStateName() {
        return null;
    }
}
