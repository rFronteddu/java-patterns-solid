package patterns.behavioral.memento.command;

import patterns.behavioral.memento.WorkflowDesigner;

public abstract class AbstractWorkflowCommand implements WorkflowCommand
{
    protected WorkflowDesigner.Memento memento;
    protected WorkflowDesigner receiver;

    public AbstractWorkflowCommand (final WorkflowDesigner designer) {
        this.receiver = designer;
    }

    @Override
    public void undo () {
        receiver.setMemento (memento);
    }
}
