package patterns.behavioral.chainofresponsability;

import java.time.Period;

// a concrete handler
public class Manager extends Employee
{
    public Manager (final LeaveApprover successor) {
        super (successor, "Project Manager");
    }

    @Override protected boolean processRequest (final LeaveApplication leaveApplication) {
        switch (leaveApplication.getType ()) {
            case Sick:
                leaveApplication.approve (getApproverRole ());
                return true;
            case PTO:
                if (leaveApplication.getNumberOfDays () <= 5) {
                    leaveApplication.approve (getApproverRole ());
                    return true;
                }
        }
        return false;
    }
}
