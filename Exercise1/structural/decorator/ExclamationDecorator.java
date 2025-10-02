package structural.decorator;

public class ExclamationDecorator implements TextProcessor {
    private TextProcessor wrappee;
    public ExclamationDecorator(TextProcessor wrappee) { this.wrappee = wrappee; }
    public String process(String text) { return wrappee.process(text) + "!!!"; }
}
