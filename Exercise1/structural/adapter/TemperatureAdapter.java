package structural.adapter;

public class TemperatureAdapter {
    private CelsiusTemperature celsius;
    public TemperatureAdapter(CelsiusTemperature celsius) { this.celsius = celsius; }
    public double getFahrenheit() {
        return (celsius.getTemp() * 9/5) + 32;
    }
}
