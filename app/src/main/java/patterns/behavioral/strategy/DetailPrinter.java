package patterns.behavioral.strategy;

import java.util.Collection;
import java.util.Iterator;

public class DetailPrinter implements OrderPrinter
{
    @Override public void print (final Collection<Order> orders) {
        System.out.println ("********* Detail Report *********");
        Iterator<Order> iter = orders.iterator ();
        double total = 0;

        for (int i = 1; iter.hasNext (); i++) {
            double orderTotal = 0;
            Order order = iter.next ();
            System.out.println (i + ". " + order.getId () + " \t" + order.getDate ());

            for (var entry : order.getItems ().entrySet ()) {
                System.out.println ("\t\t" + entry.getKey () + "\t" + entry.getValue ());
                orderTotal += entry.getValue ();
            }

            System.out.println ("-------------------------------------");
            System.out.println ("\t\t Total " + orderTotal);
            System.out.println ("-------------------------------------");
            total += orderTotal;
        }
        System.out.println ("-------------------------------------");
        System.out.println ("\tGrand Total " + total);
    }
}
