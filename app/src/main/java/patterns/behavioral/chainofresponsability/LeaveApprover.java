package patterns.behavioral.chainofresponsability;

/**
 * Represents a handler in the chain of responsibility
 */
public interface LeaveApprover
{
    void processLeaveApplication (LeaveApplication leaveApplication);

    String getApproverRole();
}
