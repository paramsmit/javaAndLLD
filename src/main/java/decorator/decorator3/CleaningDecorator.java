package decorator.decorator3;

public class CleaningDecorator extends WriteDecorator {

    CleaningDecorator(Writer writer){
        super(writer);
    }

    @Override
    public void write(String text) {
        text = text.replaceAll("[^a-zA-Z0-9]", " ");
        super.write(text);
    }
}
