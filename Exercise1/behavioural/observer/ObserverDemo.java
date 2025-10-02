package behavioural.observer;

public class ObserverDemo {
    public static void run() {
        NewsPublisher publisher = new NewsPublisher();
        Observer sub1 = new Subscriber("Alice");
        Observer sub2 = new Subscriber("Bob");

        publisher.addObserver(sub1);
        publisher.addObserver(sub2);

        publisher.notifyObservers("Breaking News: Observer Pattern Demo!");
    }
}
