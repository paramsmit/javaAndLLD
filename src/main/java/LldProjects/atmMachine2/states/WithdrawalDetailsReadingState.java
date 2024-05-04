package LldProjects.atmMachine2.states;

import LldProjects.atmMachine2.card.Card;
import LldProjects.atmMachine2.ATM;
import LldProjects.atmMachine2.card.CardManager;

public class WithdrawalDetailsReadingState implements State{

    private ATM atm;

    public WithdrawalDetailsReadingState(ATM atm) {
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
        CardManager cm = new CardManager();
        boolean valid = cm.validateWithdrawal(amount, transId);
        if(valid){
            this.atm.changeState(StateName.CASH_DISPENSING);
        } else {
            // transaction not approved
            this.atm.changeState(StateName.CARD_EJECTING);
        }
    }

    @Override
    public void cashDispense(String transId) {

    }

    @Override
    public void ejectCard() {

    }

    @Override
    public StateName getStateName() {
        return null;
    }
}
