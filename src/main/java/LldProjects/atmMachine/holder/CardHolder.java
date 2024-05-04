package LldProjects.atmMachine.holder;

import LldProjects.atmMachine.Card;

import java.util.Scanner;

public class CardHolder {
    private Card card;
    public void dispense(){
        this.card = null;
        System.out.println("card dispensed successfully...");
    }
    public void collect(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter cvv");
        final int cvv = scanner.nextInt();

        System.out.println("enter card no");
        final int cardNumber = scanner.nextInt();

        System.out.println("enter bank name");
        final String bankName = scanner.nextLine();

        this.card = new Card(cardNumber, bankName, cvv);

        System.out.println("card collected successfully...");
    }

    public Card getCard() {
        return this.card;
    }

}
