package patterns.behavioral.interpreter;

import java.util.Stack;
import java.util.StringTokenizer;

// Parses and builds abstract syntax tree
public class ExpressionBuilder
{
    private final Stack<PermissionExpression> permissions = new Stack<> ();

    private final Stack<String> operators = new Stack<> ();

    public PermissionExpression build (final Report report) {
        parse (report.getPermission ());
        buildExpression ();
        if (permissions.size () > 1 || !operators.isEmpty ()) {
            System.out.println ("ERROR!");
        }
        return permissions.pop ();
    }

    private void parse (final String permission) {
        StringTokenizer tokenizer = new StringTokenizer (permission.toLowerCase ());
        while (tokenizer.hasMoreTokens ()) {
            String token;
            switch (((token = tokenizer.nextToken ()))) {
                case "and":
                    operators.push ("and");
                    break;
                case "not":
                    operators.push ("not");
                    break;
                case "or":
                    operators.push ("or");
                    break;
                default:
                    permissions.push (new Permission (token));
                    break;
            }
        }
    }

    private void buildExpression () {
        while (!operators.isEmpty ()) {
            String operator = operators.pop ();
            PermissionExpression p1;
            PermissionExpression p2;
            PermissionExpression exp;
            switch (operator) {
                case "not":
                    p1 = permissions.pop ();
                    exp = new NotExpression (p1);
                    break;
                case "and":
                    p1 = permissions.pop ();
                    p2 = permissions.pop ();
                    exp = new AndExpression (p1, p2);
                    break;
                case "or":
                    p1 = permissions.pop ();
                    p2 = permissions.pop ();
                    exp = new OrExpression (p1, p2);
                    break;
                default:
                    throw new IllegalArgumentException ("Unknown operator:" + operator);
            }
            permissions.push (exp);
        }
    }
}
