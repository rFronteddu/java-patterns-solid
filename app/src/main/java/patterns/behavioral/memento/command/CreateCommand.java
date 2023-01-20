package patterns.behavioral.memento.command;

import patterns.behavioral.memento.WorkflowDesigner;

public class CreateCommand extends AbstractWorkflowCommand
{
    private String name;

    public CreateCommand (final WorkflowDesigner designer, final String name) {
        super (designer);
        this.name = name;
    }

    @Override public void execute () {
        this.memento = receiver.getMemento ();
        receiver.createWorkflow (name);
    }
}
