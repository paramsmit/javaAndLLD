package LldProjects.atmMachine;

public class Check {

    private final int checkNo;
    private final String bankName;
    private final int amount;

    public Check(int checkNo, String bankName, int amount) {
        this.checkNo = checkNo;
        this.bankName = bankName;
        this.amount = amount;
    }

    public int getCheckNo() {
        return checkNo;
    }

    public String getBankName() {
        return bankName;
    }

    public int getAmount() {
        return amount;
    }

}
