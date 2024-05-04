package LldProjects.atmMachine2;

import LldProjects.atmMachine2.card.Card;
import LldProjects.atmMachine2.states.State;
import LldProjects.atmMachine2.states.StateFactory;
import LldProjects.atmMachine2.states.StateName;

public class ATM {
    private State state;

    private String tranId;
    private String machineId;

    public ATM(String machineId) {
        this.machineId = machineId;
        this.state = StateFactory.getState(this, StateName.READY);
    }

    public State getState() {
        return state;
    }

    public String getTranId() {
        return tranId;
    }
    public void setTranId(String tranId) {
        this.tranId = tranId;
    }

    public String getMachineId() {
        return machineId;
    }

    public String init(String machineId){
        return this.state.init(machineId);
    }

    public void changeState(StateName stateName){
        this.state = StateFactory.getState(this, stateName);
    }

   public void readCard(Card card, String transId){
        this.state.readCard(card, transId);
   }

    public void readWithdrawalDetails(int amount, String transId){
        this.state.readWithdrawalDetails(amount, transId);
    }

    public void cashDispense(String transId){
        this.state.cashDispense(transId);
    }

    public void ejectCard(){
        this.state.ejectCard();
    }

}
