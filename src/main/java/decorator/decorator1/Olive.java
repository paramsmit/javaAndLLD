package decorator.decorator1;

public class Olive implements Topping {

    int cost = 5;
    String name = "OLIVE";
    Pizza pizza;

    public Olive(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return this.cost + pizza.getCost();
    }

    @Override
    public String getName() {
        return this.name + " " + pizza.getName();
    }
}
