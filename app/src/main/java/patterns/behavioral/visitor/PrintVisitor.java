package patterns.behavioral.visitor;

public class PrintVisitor implements Visitor
{
    @Override public void visit (final Programmer programmer) {
        String msg = programmer.getName () + " is a " + programmer.getSkill () + " programmer.";
        System.out.println (msg);
    }

    @Override public void visit (final ProjectLead projectLead) {
        String msg = projectLead.getName () + " is a project lead with " + projectLead.getDirectReports ().size () + " programmers reporting.";
        System.out.println (msg);
    }

    @Override public void visit (final Manager manager) {
        String msg = manager.getName () + " is a manager with " + manager.getDirectReports ().size () + " project leads reporting.";
        System.out.println (msg);
    }

    @Override public void visit (final VicePresident vicePresident) {
        String msg = vicePresident.getName () + " is a vice president with " + vicePresident.getDirectReports ().size () + " managers reporting.";
        System.out.println (msg);
    }
}
