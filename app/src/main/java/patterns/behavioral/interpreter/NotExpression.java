package patterns.behavioral.interpreter;

import lombok.AllArgsConstructor;

/**
 * non terminal expression
 */
@AllArgsConstructor
public class NotExpression implements PermissionExpression
{
    final private PermissionExpression expression;

    @Override public boolean interpret (User user) {
        return !expression.interpret (user);
    }

    @Override public String toString () {
        return "NOT " + expression;
    }
}
