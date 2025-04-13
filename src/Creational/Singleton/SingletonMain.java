package Creational.Singleton;

/**
 * Main class that demonstrates the Singleton Pattern using a Configuration
 * Manager example.
 */
public class SingletonMain {
    public static void main(String[] args) {
        // Get the singleton instance
        Singleton config1 = Singleton.getInstance();

        // Configure some settings
        config1.setTheme("dark-blue");
        config1.setDarkMode(true);

        // Get another reference to the singleton
        Singleton config2 = Singleton.getInstance();

        // Demonstrate that both references point to the same instance
        System.out.println("=== Demonstrating Singleton Pattern ===");
        System.out.println("Are both references the same instance? " + (config1 == config2));

        System.out.println("\n=== Configuration Values ===");
        System.out.println("Theme from config1: " + config1.getTheme());
        System.out.println("Dark mode from config2: " + config2.isDarkMode());

        // Change a setting using config2
        config2.setTheme("light-blue");

        // Show that the change is reflected in config1
        System.out.println("\n=== After changing theme using config2 ===");
        System.out.println("Theme from config1: " + config1.getTheme());
    }
}