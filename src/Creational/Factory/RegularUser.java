package Creational.Factory;

import java.util.Arrays;
import java.util.List;

public class RegularUser implements User {
    private final String role = "Regular User";
    private final List<String> permissions = Arrays.asList(
            "view_content",
            "create_content",
            "edit_own_content");

    @Override
    public String getRole() {
        return role;
    }

    @Override
    public List<String> getPermissions() {
        return permissions;
    }
}