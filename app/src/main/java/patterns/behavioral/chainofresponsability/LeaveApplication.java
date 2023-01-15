package patterns.behavioral.chainofresponsability;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.Period;

/**
 * Represents a request in our chain of responsibility
 */
@Getter @Builder
public class LeaveApplication
{
    public enum Type
    {
        Sick, PTO, LOP
    }

    public enum Status
    {
        Pending, Approved, Rejected
    }

    private final Type type;
    private final LocalDate from;
    private final LocalDate to;
    @Setter
    private String processedBy;
    @Setter
    private Status status;

    public LeaveApplication (final Type type, final LocalDate from, final LocalDate to) {
        this.type = type;
        this.from = from;
        this.to = to;
    }

    public void approve (final String approverRole) {
        processedBy = approverRole;
        status = Status.Approved;
    }

    public int getNumberOfDays () {
        return Period.between (from, to).getDays ();
    }

    // override default builder so that it only needs type, from and to
    public static class LeaveApplicationBuilder
    {
        // processedBy and status shall not be set by the constructor
        private LeaveApplicationBuilder processedBy() {
            return this;
        }
        private LeaveApplicationBuilder status() {
            return this;
        }
        
        public LeaveApplication build() {
            return new LeaveApplication (type, from, to);
        }
    }

    @Override public String toString () {
        return type + " leave for " + getNumberOfDays () + " days(s) " + status + " by " + processedBy;
    }
}
