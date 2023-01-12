package patterns.structural.facade.subsystem;

public class OrderEmailTemplate extends Template
{
    @Override public String format(final Object obj) {
        return "TEMPLATE";
    }
}
