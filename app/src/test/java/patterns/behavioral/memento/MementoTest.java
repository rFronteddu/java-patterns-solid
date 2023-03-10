package patterns.behavioral.memento;

import org.junit.Test;
import patterns.behavioral.memento.command.AddStepCommand;
import patterns.behavioral.memento.command.CreateCommand;
import patterns.behavioral.memento.command.WorkflowCommand;

import java.util.LinkedList;

public class MementoTest
{
    @Test public void mementoTest() {
        WorkflowDesigner designer = new WorkflowDesigner ();
        LinkedList<WorkflowCommand> commands = runCommands(designer);
        designer.print ();
        undoLastCommand(commands);
        designer.print ();
        undoLastCommand(commands);
        designer.print ();
        undoLastCommand(commands);
        designer.print ();
        undoLastCommand(commands);
        designer.print ();
        undoLastCommand(commands);
        designer.print ();
    }

    private static void undoLastCommand (final LinkedList<WorkflowCommand> commands) {
        if(!commands.isEmpty ()) {
            commands.removeLast ().undo ();
        }
    }

    private static LinkedList<WorkflowCommand> runCommands(WorkflowDesigner designer) {
        LinkedList<WorkflowCommand> commands = new LinkedList<> ();
        WorkflowCommand cmd = new CreateCommand (designer, "Leave Workflow");
        commands.addLast (cmd);
        cmd.execute ();

        cmd = new AddStepCommand (designer, "Create Leave Application");
        commands.addLast (cmd);
        cmd.execute ();

        cmd = new AddStepCommand (designer, "Submit Application");
        commands.addLast (cmd);
        cmd.execute ();

        cmd = new AddStepCommand (designer, "Application Approved");
        commands.addLast (cmd);
        cmd.execute ();

        return commands;
    }
}