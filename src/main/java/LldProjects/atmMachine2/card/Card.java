package LldProjects.atmMachine2.card;

public class Card {
    private final int cardNumber;
    private final String bankName;
    private final int bankCode;

    public Card(int cardNumber, String bankName, int bankCode) {
        this.cardNumber = cardNumber;
        this.bankName = bankName;
        this.bankCode = bankCode;
    }

}
