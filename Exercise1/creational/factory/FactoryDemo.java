package creational.factory;

public class FactoryDemo {
    public static void run() {
        Product p1 = ProductFactory.createProduct("A");
        Product p2 = ProductFactory.createProduct("B");
        p1.show();
        p2.show();
    }
}
