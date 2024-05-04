package decorator.decoratorself;

public class TomatoTopping extends Topping{
    TomatoTopping( BasePizza pizza) {
        super(15, "tomato", pizza);
    }
}
