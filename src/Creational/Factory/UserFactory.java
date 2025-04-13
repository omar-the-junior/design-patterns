package Creational.Factory;

public class UserFactory {
    public User createUser(String userType) {
        return switch (userType.toLowerCase()) {
            case "admin" -> new Admin();
            case "moderator" -> new Moderator();
            case "regular" -> new RegularUser();
            default -> throw new IllegalArgumentException("Invalid user type: " + userType);
        };
    }
}