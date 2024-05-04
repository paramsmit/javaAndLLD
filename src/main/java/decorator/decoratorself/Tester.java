package decorator.decoratorself;
public class Tester {
    public static void main(String [] args){
        BasePizza b = new JalepenoTopping(new TomatoTopping( new BasePizza()));
        System.out.println(b.getName());
        System.out.println(b.getCost());
    }
}
