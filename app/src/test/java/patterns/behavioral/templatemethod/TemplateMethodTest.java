package patterns.behavioral.templatemethod;


import org.junit.Test;
import patterns.behavioral.strategy.Order;

import java.io.FileNotFoundException;

public class TemplateMethodTest
{
    @Test public void templateTest() throws FileNotFoundException {
        Order o = new Order ("100");
        o.addItem ("Soda", 2);
        o.addItem ("Chips", 10);

        OrderPrinter orderPrinter = new TextPrinter ();
        // orderPrinter.printOrder (o, "template.txt");
    }
}