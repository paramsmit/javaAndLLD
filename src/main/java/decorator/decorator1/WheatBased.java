package decorator.decorator1;

public class WheatBased implements Pizza {

    int cost = 10;
    String name = "WHEATBASED";

    @Override
    public int getCost() {
        return this.cost;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
