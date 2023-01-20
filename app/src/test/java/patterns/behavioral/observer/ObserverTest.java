package patterns.behavioral.observer;

import org.junit.Test;

public class ObserverTest
{
    @Test public void observerTest() {
        Order order = new Order ("100");
        PriceObserver price = new PriceObserver ();
        order.attach (price);

        order.addItem (50);
        order.addItem (179);
        System.out.println (order);
    }
}
