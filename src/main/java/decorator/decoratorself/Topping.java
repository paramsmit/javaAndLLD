package decorator.decoratorself;

public class Topping extends BasePizza {
    private final Integer cost;
    private final String name;
    private final BasePizza basePizza;

    Topping(Integer cost, String name, BasePizza pizza){
        this.basePizza = pizza;
        this.cost = cost;
        this.name = name;
    }

    @Override
    public Integer getCost() {
        return basePizza.getCost() + this.cost;
    }

    @Override
    public String getName() {
        return basePizza.getName() + this.name;
    }
}
