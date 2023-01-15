package patterns.behavioral.chainofresponsability;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Period;

import static org.junit.Assert.assertEquals;

public class LeaveApproverTest
{
    @Test public void chainTest () {
        LeaveApplication application = LeaveApplication
                .builder ()
                .type (LeaveApplication.Type.Sick)
                .from (LocalDate.now ())
                .to (LocalDate.now ().plus (Period.ofDays (2)))
                .build ();
        var approver = createChain ();
        approver.processLeaveApplication (application);
        assertEquals (application.getProcessedBy (), "Project Lead");
    }

    private static LeaveApprover createChain () {
        Director director = new Director (null);
        Manager manager = new Manager (director);
        return new Lead (manager);
    }
}