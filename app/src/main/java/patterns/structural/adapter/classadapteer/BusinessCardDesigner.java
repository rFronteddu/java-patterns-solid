package patterns.structural.adapter.classadapteer;

public class BusinessCardDesigner
{
    public String designCard (final Customer customer) {
        String card = "";
        card = customer.getName ();
        card += "\n" + customer.getDesignation();
        card += "\n" + customer.getAddress();
        return card;
    }
}
