package patterns.behavioral.state;

import org.junit.Test;

public class StateTest
{
    @Test public void stateTest() {
        Order order = new Order ();
        // order.cancel ();
        order.paymentSuccessful ();
        order.cancel ();
    }
}