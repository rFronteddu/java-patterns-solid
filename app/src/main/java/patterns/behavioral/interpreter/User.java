package patterns.behavioral.interpreter;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@Getter
public class User
{
    private final List<String> permissions;

    private final String username;

    public User (final String username, final String... permissions) {
        this.username = username;
        this.permissions = new ArrayList<> ();
        Stream.of (permissions).forEach (e -> this.permissions.add (e.toLowerCase ()));
    }
}
