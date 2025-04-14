package Structural.Adapter;

public class ImperialWeatherAdapter implements WeatherService {
    private MetricWeatherService metricService;

    public ImperialWeatherAdapter(MetricWeatherService metricService) {
        this.metricService = metricService;
    }

    @Override
    public double getTemperature() {
        // Convert Celsius to Fahrenheit
        double celsius = metricService.getTemperature();
        return (celsius * 9/5) + 32;
    }

    @Override
    public double getWindSpeed() {
        // Convert km/h to mph
        double kmh = metricService.getWindSpeed();
        return kmh * 0.621371;
    }

    @Override
    public double getDistance() {
        // Convert kilometers to miles
        double km = metricService.getDistance();
        return km * 0.621371;
    }
}