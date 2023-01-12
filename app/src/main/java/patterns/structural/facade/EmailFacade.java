package patterns.structural.facade;

import patterns.structural.facade.subsystem.*;

/**
 * Facade provides simple methods for client to use
 */
public class EmailFacade
{
    // the goal is to make it easier for the client to use the subsystem
    public boolean sendOrderEmail (final Order order) {
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
