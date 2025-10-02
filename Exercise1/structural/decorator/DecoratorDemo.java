package structural.decorator;

public class DecoratorDemo {
    public static void run() {
        TextProcessor base = new BaseTextProcessor();
        TextProcessor upper = new UpperCaseDecorator(base);
        TextProcessor excited = new ExclamationDecorator(upper);

        System.out.println(excited.process("hello world"));
    }
}
