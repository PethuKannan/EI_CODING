package structural.adapter;

public class AdapterDemo {
    public static void run() {
        CelsiusTemperature c = new CelsiusTemperature(25);
        TemperatureAdapter adapter = new TemperatureAdapter(c);
        System.out.println("25C in Fahrenheit: " + adapter.getFahrenheit());
    }
}
