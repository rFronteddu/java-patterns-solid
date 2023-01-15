package patterns.behavioral.command;

import org.junit.Test;

public class CommandTest
{
    @Test public void commandTest () throws InterruptedException {
        EWSService service = new EWSService ();
        Command c1 = new AddMemberCommand ("a@acom", "spam", service);
        var instance = MailTaskRunner.getInstance ();
        instance.addCommand (c1);
        Command c2 = new AddMemberCommand ("b@acom", "spam", service);
        instance.addCommand (c2);
        Thread.sleep (5000);
        instance.shutdown ();
    }
}