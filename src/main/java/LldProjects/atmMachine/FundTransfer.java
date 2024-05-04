package LldProjects.atmMachine;

import LldProjects.atmMachine.holder.CardHolder;
import LldProjects.atmMachine.holder.CashHolder;

public class FundTransfer implements Feature{

    public FundTransfer(CardHolder cardHolder) {
        this.cardHolder = cardHolder;
    }

    private CardHolder cardHolder;
    private int accountNo;

    @Override
    public void processTransaction() {

        // scan account no.
        // call api to transfer fund
        //
        try{

        } catch (Exception e){

        } finally {
            cardHolder.dispense();
        }

    }
}
