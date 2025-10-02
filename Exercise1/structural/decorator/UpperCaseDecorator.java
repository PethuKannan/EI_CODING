package structural.decorator;

public class UpperCaseDecorator implements TextProcessor {
    private TextProcessor wrappee;
    public UpperCaseDecorator(TextProcessor wrappee) { this.wrappee = wrappee; }
    public String process(String text) { return wrappee.process(text).toUpperCase(); }
}
