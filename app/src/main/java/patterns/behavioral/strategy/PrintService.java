package patterns.behavioral.strategy;

import lombok.AllArgsConstructor;

import java.util.LinkedList;

// context
@AllArgsConstructor
public class PrintService
{
    private OrderPrinter printer;


    public void printOrders (final LinkedList<Order> orders) {
        printer.print (orders);
    }
}
