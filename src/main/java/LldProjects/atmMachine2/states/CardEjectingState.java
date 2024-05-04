package LldProjects.atmMachine2.states;

import LldProjects.atmMachine2.card.Card;
import LldProjects.atmMachine2.ATM;

public class CardEjectingState implements State{

    private ATM atm;

    public CardEjectingState(ATM atm) {
        this.atm = atm;
    }

    @Override
    public String init(String machineId) {
        throw new IllegalStateException();
    }

    @Override
    public void readCard(Card card, String transId) {
        throw new IllegalStateException();
    }

    @Override
    public void readWithdrawalDetails(int amount, String transId) {
        throw new IllegalStateException();
    }

    @Override
    public void cashDispense(String transId) {
        throw new IllegalStateException();
    }

    @Override
    public void ejectCard() {
        // eject card.
        this.atm.changeState(StateName.READY);
    }

    @Override
    public StateName getStateName() {
        return null;
    }
}
