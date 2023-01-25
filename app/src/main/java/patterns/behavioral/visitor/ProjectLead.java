package patterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ProjectLead extends AbstractEmployee
{
    private final List<Employee> directReports = new ArrayList<> ();

    public ProjectLead (final String name, final Employee...employees) {
        super (name);
        directReports.addAll (Arrays.asList (employees));
    }

    @Override public Collection<Employee> getDirectReports() {
        return directReports;
    }

    public @Override void accept (final Visitor visitor) {
        visitor.visit (this);
    }
}
