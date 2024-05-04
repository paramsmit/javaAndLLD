package decorator.decorator2;

public abstract class Topping extends Pizza {

    final Pizza pizza;

    Topping(int cost, String name, Pizza pizza) {
        super(cost, name);
        this.pizza = pizza;
    }

    public String getName(){
        return super.getName() + " " + pizza.getName();
    }

    public int getCost(){
        return super.getCost() + pizza.getCost();
    }
}


// delegation of work
