package patterns.behavioral.command;

// mocked receiver
public class EWSService
{
    // add new member to mailing list
    public void addMember (final String contact, final String contactGroup) {
        System.out.println ("Added " + contact + " to " + contactGroup);
    }

    // remove new member to mailing list
    public void removeMember (final String contact, final String contactGroup) {
        System.out.println ("Removed " + contact + " to " + contactGroup);
    }
}
