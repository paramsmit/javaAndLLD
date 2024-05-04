package LldProjects.atmMachine2.states;

import LldProjects.atmMachine2.card.Card;

public interface State {

    String init(String machineId);

    void readCard(Card card, String transId);

    void readWithdrawalDetails(int amount, String transId);

    void cashDispense(String transId);

    void ejectCard();

    StateName getStateName();
}
