package patterns.behavioral.observer;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

// a concrete subject
@ToString
public class Order
{
    private String id;
    @Setter
    private double shippingCost;
    @Setter
    private double discount;
    private double total;
    @Getter
    private int count;

    private final List<OrderObserver> observers = new ArrayList<> ();

    public Order (final String id) {
        this.id = id;
    }

    public void attach (final OrderObserver observer) {
        observers.add (observer);
    }

    public void detach (final OrderObserver observer) {
        observers.remove (observer);
    }

    public void addItem (final double price) {
        total += price;
        count++;
        observers.forEach (o -> o.updated (this));
    }

    public double getTotal() {
        return total - discount;
    }
}
