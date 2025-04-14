package Structural.Adapter;

public class MetricWeatherService implements WeatherService {
    @Override
    public double getTemperature() {
        // Simulated temperature in Celsius
        return 25.0;
    }

    @Override
    public double getWindSpeed() {
        // Simulated wind speed in kilometers per hour
        return 15.0;
    }

    @Override
    public double getDistance() {
        // Simulated distance in kilometers
        return 100.0;
    }
}