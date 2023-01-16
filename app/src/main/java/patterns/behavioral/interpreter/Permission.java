package patterns.behavioral.interpreter;

import lombok.AllArgsConstructor;

import java.util.Locale;

// Terminal expression
public class Permission implements PermissionExpression
{
    private final String permission;

    public Permission (final String permission) {
        // permission are all lower case
        this.permission = permission.toLowerCase ();
    }

    @Override public boolean interpret (final User user) {
        // naive check, if permission is in, authorize
        return user.getPermissions ().contains (permission);
    }

    public @Override String toString () {
        return permission;
    }
}
