package patterns.structural.facade.subsystem;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor @Getter @Setter
public class Order
{
    private String id;
    private double total;
}
