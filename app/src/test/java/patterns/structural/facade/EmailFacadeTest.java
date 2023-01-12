package patterns.structural.facade;

import org.junit.Test;
import patterns.structural.facade.subsystem.*;

public class EmailFacadeTest
{
    @Test public void facadeTest() {
        Order order = new Order ("101", 99.99);
        boolean result = sendOrderEmailWithoutFacade(order);
        System.out.println ("Order Email " + (result ? "sent" : "Not Sent..."));

        EmailFacade facade = new EmailFacade ();
        var result2 = facade.sendOrderEmail (order);
        System.out.println ("Order Email " + (result2 ? "sent" : "Not Sent..."));
    }

    private boolean sendOrderEmailWithoutFacade (Order order) {
        Template template = TemplateFactory.createTemplateFor (Template.TemplateType.Email);
        Stationary stationary = StationaryFactory.createStationary ();
        Email email = Email.getBuilder ()
                .withTemplate (template)
                .withStationary (stationary)
                .forObject (order)
                .getEmail ();
        Mailer mailer = Mailer.getMailer ();
        return mailer.send (email);
    }
}