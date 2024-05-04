package LldProjects.atmMachine2.states;

import LldProjects.atmMachine2.card.Card;
import LldProjects.atmMachine2.ATM;

public class ReadyState implements State{
    private ATM atm;

    public ReadyState(ATM atm) {
        this.atm = atm;
    }

    @Override
    public String init(String machineId) {
        // get transaction id.
        String transId = "123";
        atm.setTranId(transId);
        atm.changeState(StateName.CARD_READING);
        return transId;
    }

    @Override
    public void readCard(Card card, String transId) {

    }

    @Override
    public void readWithdrawalDetails(int amount, String transId) {

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
