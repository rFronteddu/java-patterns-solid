package patterns.structural.facade.subsystem;

public class Email
{
    public static EmailBuilder getBuilder() {
        return new EmailBuilder ();
    }
}
