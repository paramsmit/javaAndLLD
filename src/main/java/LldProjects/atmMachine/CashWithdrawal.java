package LldProjects.atmMachine;

import LldProjects.atmMachine.holder.CardHolder;
import LldProjects.atmMachine.holder.CashHolder;

public class CashWithdrawal implements Feature {
    public CashWithdrawal(CashHolder cashHolder, CardHolder cardHolder) {
        this.cashHolder = cashHolder;
        this.cardHolder = cardHolder;
    }

    private CashHolder cashHolder;
    private CardHolder cardHolder;

    @Override
    public void processTransaction() {

    }
}
