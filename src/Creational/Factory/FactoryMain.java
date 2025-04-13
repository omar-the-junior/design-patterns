package Creational.Factory;

/**
 * Main class that demonstrates the Factory Pattern using a User Factory
 * example.
 */
public class FactoryMain {
    public static void main(String[] args) {
        UserFactory userFactory = new UserFactory();

        // Create different types of users
        User admin = userFactory.createUser("admin");
        User moderator = userFactory.createUser("moderator");
        User regularUser = userFactory.createUser("regular");

        // Display user roles and permissions
        System.out.println("=== Admin ===");
        System.out.println("Role: " + admin.getRole());
        System.out.println("Permissions: " + admin.getPermissions());

        System.out.println("\n=== Moderator ===");
        System.out.println("Role: " + moderator.getRole());
        System.out.println("Permissions: " + moderator.getPermissions());

        System.out.println("\n=== Regular User ===");
        System.out.println("Role: " + regularUser.getRole());
        System.out.println("Permissions: " + regularUser.getPermissions());
    }
}