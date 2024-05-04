package decorator.decorator3;

public class WriteDecorator implements Writer{

    Writer writer;

    public WriteDecorator(Writer writer) {
        this.writer = writer;
    }

    @Override
    public void write(String text) {
        writer.write(text);
    }
}
