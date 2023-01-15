package patterns.behavioral.chainofresponsability;

// a concrete handler
public class Lead extends Employee
{
    public Lead (final LeaveApprover successor) {
        super (successor, "Project Lead");
    }

    @Override protected boolean processRequest (final LeaveApplication leaveApplication) {
        // can process if type is sick and duration less than or equal to 2 days
        if (leaveApplication.getType ().equals (LeaveApplication.Type.Sick)) {
            if (leaveApplication.getNumberOfDays () <= 2) {
                leaveApplication.approve (getApproverRole ());
                return true;
            }
        }
        return false;
    }
}
