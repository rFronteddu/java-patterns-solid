package patterns.behavioral.chainofresponsability;

// a concrete handler
public class Director extends Employee
{
    public Director (final LeaveApprover successor) {
        super (successor, "Director");
    }

    @Override protected boolean processRequest (final LeaveApplication leaveApplication) {
        if (leaveApplication.getType () == LeaveApplication.Type.PTO) {
            leaveApplication.approve (getApproverRole ());
            return true;
        }
        return false;
    }
}
