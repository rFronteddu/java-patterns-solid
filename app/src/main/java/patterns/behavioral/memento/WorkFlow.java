package patterns.behavioral.memento;


import lombok.Getter;

import java.util.Arrays;
import java.util.LinkedList;


public class WorkFlow
{
    private LinkedList<String> steps;
    @Getter
    private String name;

    public WorkFlow (final String name) {
        this.name = name;
        this.steps = new LinkedList<> ();
    }

    public WorkFlow (final String name, final String... steps) {
        this.name = name;
        this.steps = new LinkedList<> ();
        if (steps == null) {
            return;
        }
        this.steps.addAll (Arrays.asList (steps));
    }

    public @Override String toString () {
        StringBuilder builder = new StringBuilder ("Workflow [name=");
        builder.append (name).append ("]\nBEGIN -> ");
        for (final String step : steps) {
            builder.append (step).append (" -> ");
        }
        builder.append ("END");
        return builder.toString ();
    }

    public void addStep (final String step) {
        steps.addLast (step);
    }

    public boolean removeStep (final String step) {
        return steps.remove (step);
    }

    public String[] getSteps () {
        return steps.toArray (new String[0]);
    }
}
