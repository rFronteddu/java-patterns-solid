package patterns.behavioral.chainofresponsability;

import lombok.AllArgsConstructor;

// Abstract handler
@AllArgsConstructor
public abstract class Employee implements LeaveApprover
{
    private LeaveApprover successor;
    private String role;

    @Override public void processLeaveApplication (final LeaveApplication leaveApplication) {
        if (!processRequest (leaveApplication) && successor != null) {
            successor.processLeaveApplication (leaveApplication);
        }
    }

    @Override public String getApproverRole () {
        return role;
    }

    protected abstract boolean processRequest (final LeaveApplication leaveApplication);
}
