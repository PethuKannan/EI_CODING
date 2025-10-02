package creational.factory;

public class ProductFactory {
    public static Product createProduct(String type) {
        if (type.equalsIgnoreCase("A")) return new ProductA();
        if (type.equalsIgnoreCase("B")) return new ProductB();
        throw new IllegalArgumentException("Unknown product type");
    }
}
