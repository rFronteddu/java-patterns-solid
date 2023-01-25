package patterns.behavioral.visitor;


import lombok.Getter;
import lombok.Setter;

import java.util.Collection;
import java.util.Collections;

public abstract class AbstractEmployee implements Employee
{
    @Getter
    @Setter
    private int performanceRating;
    @Getter
    private final String name;
    private static int employeeIdCounter = 101;
    @Getter
    private final int employeeId;

    public AbstractEmployee (final String name) {
        this.name = name;
        employeeId = employeeIdCounter++;
    }

    @Override public Collection<Employee> getDirectReports () {
        return Collections.emptyList ();
    }
}
