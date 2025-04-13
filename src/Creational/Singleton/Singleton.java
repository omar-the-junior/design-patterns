package Creational.Singleton;

/**
 * A simple Configuration Manager implementing the Singleton pattern.
 * This class manages application settings that should be consistent throughout
 * the application.
 */
public class Singleton {
    // The single instance
    private static Singleton instance;

    // Configuration values
    private String theme;
    private boolean darkMode;

    /**
     * Private constructor to prevent direct instantiation
     */
    private Singleton() {
        // Default configuration values
        theme = "default";
        darkMode = false;
    }

    /**
     * Get the single instance of the configuration manager
     */
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Configuration getters and setters
    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public boolean isDarkMode() {
        return darkMode;
    }

    public void setDarkMode(boolean darkMode) {
        this.darkMode = darkMode;
    }
}