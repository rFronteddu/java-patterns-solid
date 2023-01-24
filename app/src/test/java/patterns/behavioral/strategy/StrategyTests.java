package patterns.behavioral.strategy;

import org.junit.Test;

import java.util.LinkedList;

public class StrategyTests
{
    @Test public void strategyTest () {
        var orders = createOrders ();
        PrintService service = new PrintService (new SummaryPrinter ());
        // can also use another strategy -> DetailPrinter()
        service.printOrders (orders);
    }

    private static LinkedList<Order> createOrders () {
        LinkedList<Order> orders = new LinkedList<> ();

        Order o = new Order ("100");
        o.addItem ("Soda", 2);
        o.addItem ("Chips", 10);
        orders.add (o);

        o = new Order ("200");
        o.addItem ("Cake", 20);
        o.addItem ("Cookies", 5);
        orders.add (o);

        o = new Order ("300");
        o.addItem ("Burger", 8);
        o.addItem ("Fries", 5);
        orders.add (o);

        return orders;
    }
}