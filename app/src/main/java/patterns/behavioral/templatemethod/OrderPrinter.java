package patterns.behavioral.templatemethod;

import patterns.behavioral.strategy.Order;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

// abstract base class defines the template method
public abstract class OrderPrinter
{
    // declared final so subclasses cannot change this, this is the template method
    public final void printOrder (final Order order, final String filename) throws FileNotFoundException {
        try (PrintWriter writer = new PrintWriter (filename)) {
            writer.println (start ());
            writer.println (formatOrderNumber (order));
            writer.println (formatItems (order));
            writer.println (formatTotal (order));
            writer.println (end ());
        }
    }


    protected abstract String formatItems (Order order);

    protected abstract String formatOrderNumber (final Order order);

    protected abstract String formatTotal (Order order);

    protected abstract String start ();

    protected abstract String end ();
}
