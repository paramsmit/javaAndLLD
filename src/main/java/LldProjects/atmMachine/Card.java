package LldProjects.atmMachine;

public class Card {

    private final int cardNo;
    private final String bankName;
    private final int cvv;

    public Card(int cardNo, String bankName, int cvv) {
        this.cardNo = cardNo;
        this.bankName = bankName;
        this.cvv = cvv;
    }

    public int getCardNo() {
        return cardNo;
    }

    public String getBankName() {
        return bankName;
    }

    public int getCvv() {
        return cvv;
    }

}
