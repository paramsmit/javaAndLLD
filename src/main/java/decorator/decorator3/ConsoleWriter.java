package decorator.decorator3;

public class ConsoleWriter implements Writer{
    @Override
    public void write(String text) {
        System.out.println(text);
    }
}
