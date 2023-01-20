package patterns.behavioral.memento.command;

import patterns.behavioral.memento.WorkflowDesigner;

public class RemoveStepCommand extends AbstractWorkflowCommand
{
    final private String step;

    public RemoveStepCommand (final WorkflowDesigner designer, final String step) {
        super (designer);
        this.step = step;
    }

    @Override public void execute () {
        memento = receiver.getMemento ();
        receiver.removeStep (step);
    }
}
