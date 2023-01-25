package patterns.behavioral.templatemethod;

import patterns.behavioral.strategy.Order;

// Concrete implementation, implements the steps
public class TextPrinter extends OrderPrinter
{
    @Override protected String formatItems (Order order) {
        StringBuilder builder = new StringBuilder ("Items\n-------------------------------------------\n");
        for (var entry : order.getItems ().entrySet ()) {
            builder.append (entry.getKey ()).append (" $").append (entry.getValue ()).append ("\n");
        }
        builder.append ("-------------------------------------------");
        return builder.toString ();
    }

    @Override protected String formatOrderNumber (Order order) {
        return "Order #" + order.getId ();
    }

    @Override protected String formatTotal (Order order) {
        return "Total: $" + order.getTotal ();
    }

    @Override protected String start () {
        return "Order Details";
    }

    @Override protected String end () {
        return "";
    }
}
