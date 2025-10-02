import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nChoose a pattern to run:");
            System.out.println("1. Behavioural - Strategy");
            System.out.println("2. Behavioural - Observer");
            System.out.println("3. Creational - Factory");
            System.out.println("4. Creational - Builder");
            System.out.println("5. Structural - Adapter");
            System.out.println("6. Structural - Decorator");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> behavioural.strategy.StrategyDemo.run();
                case 2 -> behavioural.observer.ObserverDemo.run();
                case 3 -> creational.factory.FactoryDemo.run();
                case 4 -> creational.builder.BuilderDemo.run();
                case 5 -> structural.adapter.AdapterDemo.run();
                case 6 -> structural.decorator.DecoratorDemo.run();
                case 0 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice, try again.");
            }
        }
    }
}
