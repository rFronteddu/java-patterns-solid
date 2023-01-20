package patterns.behavioral.memento.command;

import patterns.behavioral.memento.WorkflowDesigner;

public class AddStepCommand extends AbstractWorkflowCommand
{
    private final String step;

    public AddStepCommand (final WorkflowDesigner designer, final String step) {
        super (designer);
        this.step = step;
    }

    @Override public void execute () {
        this.memento = receiver.getMemento ();
        receiver.addStep (step);
    }
}
