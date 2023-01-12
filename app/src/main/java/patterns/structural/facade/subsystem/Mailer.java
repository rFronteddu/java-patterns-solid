package patterns.structural.facade.subsystem;

public class Mailer
{
    private static final Mailer MAILER = new Mailer ();

    public static Mailer getMailer () {
        return MAILER;
    }

    private Mailer () {}

    public boolean send (final Email email) {
        return true;
    }
}

