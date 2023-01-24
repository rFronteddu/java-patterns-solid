package patterns.behavioral.strategy;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Order
{
    @Getter
    private final String id;
    @Getter
    private final LocalDate date;
    @Getter
    private final Map<String, Double> items = new HashMap<> ();
    @Getter @Setter
    private double total;

    public Order (final String id) {
        this.id = id;
        date = LocalDate.now ();
    }

    public void addItem(final String name, final double price) {
        items.put (name, price);
        total += price;
    }
}
