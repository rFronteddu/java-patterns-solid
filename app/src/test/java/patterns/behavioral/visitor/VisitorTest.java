package patterns.behavioral.visitor;


import org.junit.Test;

public class VisitorTest
{
    @Test public void visitorTests () {
        var emp = buildOrganization ();
        var visitor = new PrintVisitor ();
        visitOrgStructure(emp, visitor);
    }

    private static Employee buildOrganization () {
        Programmer p1 = new Programmer ("Rachel", "C++");
        Programmer p2 = new Programmer ("Andy", "Java");

        Programmer p3 = new Programmer ("Josh", "C#");
        Programmer p4 = new Programmer ("Bill", "C++");

        ProjectLead pl1 = new ProjectLead ("Tina", p1, p2);
        ProjectLead pl2 = new ProjectLead ("Joey", p3, p4);

        Manager m1 = new Manager ("Chad", pl1);
        Manager m2 = new Manager ("Chad II", pl2);

        return new VicePresident ("Richard", m1, m2);
    }

    private static void visitOrgStructure (final Employee emp, final Visitor visitor) {
        emp.accept (visitor);
        emp.getDirectReports ().forEach (e->visitOrgStructure (e, visitor));
    }
}