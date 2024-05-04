package decorator.decorator1;

public class Mushroom implements Topping{

    int cost = 5;
    String name = "MUSHROOM";
    Pizza pizza;

    public Mushroom(Pizza pizza){
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
