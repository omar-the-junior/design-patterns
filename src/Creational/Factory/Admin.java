package Creational.Factory;

import java.util.Arrays;
import java.util.List;

public class Admin implements User {
    private final String role = "Admin";
    private final List<String> permissions = Arrays.asList(
            "create_user",
            "delete_user",
            "edit_user",
            "manage_system",
            "view_logs");

    @Override
    public String getRole() {
        return role;
    }

    @Override
    public List<String> getPermissions() {
        return permissions;
    }
}