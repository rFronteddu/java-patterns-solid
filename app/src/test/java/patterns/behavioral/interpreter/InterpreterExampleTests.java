package patterns.behavioral.interpreter;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class InterpreterExampleTests
{
    @Test public void interpreterTest () {
        Report r1 = new Report ("Cashflow report", "NOT ADMIN");
        ExpressionBuilder builder = new ExpressionBuilder ();
        var exp = builder.build (r1);
        User user1 = new User ("Dave", "USER", "ADMIN");
        assertFalse (exp.interpret (user1));
        User user2 = new User ("Mike", "USER", "FINANCE");
        assertTrue (exp.interpret (user2));


        Report r2 = new Report ("Cashflow2 report", "FINANCE_ADMIN OR ADMIN");
        var exp2 = builder.build (r2);
        System.out.println (exp2.toString ());
        assertTrue (exp2.interpret (user1));
        assertFalse (exp2.interpret (user2));
    }
}