package LldProjects.atmMachine;

import LldProjects.atmMachine.holder.CardHolder;
import LldProjects.atmMachine.holder.CashHolder;
import LldProjects.atmMachine.holder.CheckHolder;

public class FeatureFactory {

    private CardHolder cardHolder;
    private CashHolder cashHolder;
    private CheckHolder checkHolder;

    public FeatureFactory(CardHolder cardHolder, CashHolder cashHolder, CheckHolder checkHolder) {
        this.cardHolder = cardHolder;
        this.cashHolder = cashHolder;
        this.checkHolder = checkHolder;
    }

    Feature getFeature(FeatureName featureName){
        if(FeatureName.CASH_WITHDRAWAL.equals(featureName)){
            return new CashWithdrawal(this.cashHolder, this.cardHolder);
        } else if(FeatureName.FUND_TRANSFER.equals(featureName)){
            return new FundTransfer(this.cardHolder);
        } else {
            return null;
        }
    }



}
