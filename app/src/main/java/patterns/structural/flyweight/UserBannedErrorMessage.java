package patterns.structural.flyweight;

import lombok.Getter;

import java.time.Duration;

/**
 * unshared concrete flyweight
 */
public class UserBannedErrorMessage implements ErrorMessage
{
    // all state is defined here
    @Getter
    private String caseId;
    private String remarks;
    private Duration banDuration;
    private String msg;

    public UserBannedErrorMessage (final String caseId) {
        // load case info from DB
        this.caseId = caseId;
        remarks = "You violated terms of use.";
        msg = "You are BANNED. Sorry. \nMore information:\n";
        msg += caseId + "\n";
        msg += remarks + "\n";
        msg += "Banned for: " + (banDuration != null ? banDuration.toHours () : "1")  + " Hours";
    }

    // ignore extrinsic state argument
    @Override public String getText (final String code) {
        return msg;
    }
}
