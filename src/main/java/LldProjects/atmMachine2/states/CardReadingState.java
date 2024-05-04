package LldProjects.atmMachine2.states;


import LldProjects.atmMachine2.card.Card;
import LldProjects.atmMachine2.ATM;
import LldProjects.atmMachine2.card.CardManager;

public class CardReadingState implements State{

    private ATM atm;

    public CardReadingState(ATM atm) {
        this.atm = atm;
    }

    @Override
    public String init(String machineId) {
        throw new IllegalStateException();
    }

    @Override
    public void readCard(Card card, String transId) {
        CardManager cm = new CardManager();
        boolean valid = cm.validateCard(card, transId);
        if(valid){
            // transaction approved
            // go to withdrawal details reading state.
            this.atm.changeState(StateName.WITHDRAWAL_DETAILS_READING);
        } else {
            // transaction not approved.
            this.atm.changeState(StateName.CARD_EJECTING);
        }
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
