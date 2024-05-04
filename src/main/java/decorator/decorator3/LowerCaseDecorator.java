package decorator.decorator3;

public class LowerCaseDecorator extends WriteDecorator {

    LowerCaseDecorator(Writer writer){
        super(writer);
    }

    @Override
    public void write(String text) {
        text = text.toLowerCase();
        super.write(text);
    }
}
