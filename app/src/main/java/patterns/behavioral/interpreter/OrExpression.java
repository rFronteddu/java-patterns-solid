package patterns.behavioral.interpreter;

import lombok.AllArgsConstructor;

/**
 * non terminal expression
 */
@AllArgsConstructor
public class OrExpression implements PermissionExpression
{
    final private PermissionExpression expression1;
    final private PermissionExpression expression2;

    @Override public boolean interpret (User user) {
        return expression1.interpret (user) || expression2.interpret (user);
    }

    @Override public String toString () {
        return expression1 + " OR " + expression2;
    }
}
