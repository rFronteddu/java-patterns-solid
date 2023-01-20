package patterns.behavioral.memento;

import lombok.Getter;

public class WorkflowDesigner
{
    @Getter
    private WorkFlow workFlow;

    public void createWorkflow (final String name) {
        workFlow = new WorkFlow (name);
    }

    public Memento getMemento () {
        return workFlow == null ?
                new Memento () :
                new Memento (workFlow.getName (), workFlow.getSteps ());
    }

    public void setMemento (final Memento memento) {
        workFlow = memento.isEmpty () ? null : new WorkFlow (memento.name, memento.getSteps ());
    }

    public void addStep (final String step) {
        workFlow.addStep (step);
    }

    public void removeStep (final String step) {
        workFlow.removeStep (step);
    }

    public void print () {
        System.out.println (workFlow);
    }

    public class Memento
    {
        private String[] steps;
        private String name;

        private Memento () {}

        private Memento (final String name, final String[] steps) {
            this.steps = steps;
            this.name = name;
        }

        private String getName () {
            return name;
        }

        private String[] getSteps () {
            return steps;
        }

        private boolean isEmpty () {
            return getSteps () == null && getName () == null;
        }
    }
}
