package decorator.decorator2;

public abstract class Pizza {

    final int cost;
    final String name;

    Pizza(int cost, String name){
        this.cost = cost;
        this.name = name;
    }

    public int getCost(){return this.cost;}
    public String getName(){return this.name;}
}
