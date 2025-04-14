package Structural.Adapter;

public class AdapterMain {
    public static void main(String[] args) {
        // Create an instance of the MetricWeatherService
        MetricWeatherService metricService = new MetricWeatherService();
        
        // Create an adapter to convert to imperial units
        ImperialWeatherAdapter imperialAdapter = new ImperialWeatherAdapter(metricService);

        // Display weather data in both metric and imperial units
        System.out.println("Metric Weather Service:");
        System.out.printf("Temperature: %.1f°C%n", metricService.getTemperature());
        System.out.printf("Wind Speed: %.1f km/h%n", metricService.getWindSpeed());
        System.out.printf("Distance: %.1f km%n", metricService.getDistance());

        System.out.println("\nImperial Weather Service (through adapter):");
        System.out.printf("Temperature: %.1f°F%n", imperialAdapter.getTemperature());
        System.out.printf("Wind Speed: %.1f mph%n", imperialAdapter.getWindSpeed());
        System.out.printf("Distance: %.1f miles%n", imperialAdapter.getDistance());
    }
}