package LldProjects.atmMachine2.states;

import LldProjects.atmMachine2.ATM;

public class StateFactory {

    private StateFactory(){

    }

    public static State getState(ATM atm, StateName stateName){
        if(StateName.READY.equals(stateName)){
            return new ReadyState(atm);
        } else if(StateName.CARD_READING.equals(stateName)){
            return new CardReadingState(atm);
        } else if(StateName.WITHDRAWAL_DETAILS_READING.equals(stateName)){
            return new WithdrawalDetailsReadingState(atm);
        } else if(StateName.CASH_DISPENSING.equals(stateName)){
            return new CashDispensingState(atm);
        } else {
            return new CardEjectingState(atm);
        }
    }

}
