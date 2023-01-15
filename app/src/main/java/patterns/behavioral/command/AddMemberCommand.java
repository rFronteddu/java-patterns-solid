package patterns.behavioral.command;

import lombok.AllArgsConstructor;

/**
 * A concrete impl of command
 */
@AllArgsConstructor
public class AddMemberCommand implements Command
{
    private String emailAddress;
    private String listName;
    private EWSService receiver;

    @Override public void execute () {
        receiver.addMember (emailAddress, listName);
    }
}
