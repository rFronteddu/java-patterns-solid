package patterns.structural.flyweight;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ErrorMessageTest
{
    @Test public void flyweightTest () {
        SystemErrorMessage msg1 = ErrorMessageFactory
                .getInstance ().getError (ErrorMessageFactory.ErrorType.GenericSystemError);
        assertEquals ("A genetic error of type 4056 occurred. Please refer to :\n" + "https://google.com/q=4056", msg1.getText ("4056"));

        UserBannedErrorMessage msg2 = ErrorMessageFactory.getInstance ().getUserBannedMessage ("1202");
        System.out.println (msg2.getText (null));
    }

}