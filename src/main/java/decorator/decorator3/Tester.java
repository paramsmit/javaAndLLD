package decorator.decorator3;

public class Tester {
    public static void main(String [] args){
        Writer writer = new LowerCaseDecorator(new CleaningDecorator(new ConsoleWriter()));
        writer.write("MY*name&is Paramsmit");
    }
}
