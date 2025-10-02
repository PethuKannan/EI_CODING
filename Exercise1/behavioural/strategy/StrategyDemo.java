package behavioural.strategy;

public class StrategyDemo {
    public static void run() {
        PaymentStrategy card = new CreditCardPayment();
        PaymentStrategy paypal = new PayPalPayment();
        card.pay(100);
        paypal.pay(200);
    }
}
