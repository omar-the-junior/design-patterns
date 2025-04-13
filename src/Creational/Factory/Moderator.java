package Creational.Factory;

import java.util.Arrays;
import java.util.List;

public class Moderator implements User {
    private final String role = "Moderator";
    private final List<String> permissions = Arrays.asList(
            "edit_content",
            "delete_content",
            "manage_users",
            "view_reports");

    @Override
    public String getRole() {
        return role;
    }

    @Override
    public List<String> getPermissions() {
        return permissions;
    }
}