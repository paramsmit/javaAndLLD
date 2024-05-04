package decorator.decorator1;

public class Tester {

    public static void main(String[] args) {
        Pizza pizza = new Mushroom(new Olive (new WheatBased()));
        System.out.println(pizza.getName());
    }
}

