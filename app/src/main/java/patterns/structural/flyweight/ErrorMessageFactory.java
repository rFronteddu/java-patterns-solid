package patterns.structural.flyweight;

import patterns.creational.builder.User;

import java.util.HashMap;
import java.util.Map;

// flyweights factory. Return shared flyweight instance
// we are not worrying about synchronization here to keep things simple.
public class ErrorMessageFactory
{
    // key for the flyweight instance
    static public enum ErrorType
    {
        GenericSystemError, PageNotFoundError, ServerError
    }

    private Map<ErrorType, SystemErrorMessage> errorMessages = new HashMap<> ();

    private static final ErrorMessageFactory FACTORY = new ErrorMessageFactory ();

    public static ErrorMessageFactory getInstance () {
        return FACTORY;
    }

    public SystemErrorMessage getError (final ErrorType type) {
        return errorMessages.get (type);
    }

    private ErrorMessageFactory () {
        errorMessages.put (ErrorType.GenericSystemError,
                new SystemErrorMessage ("A genetic error of type $errorCode occurred. Please refer to :\n",
                        "https://google.com/q="));
        errorMessages.put (ErrorType.PageNotFoundError,
                new SystemErrorMessage ("Page not found. An error of type $errorCode occurred. Please refer to :\n",
                        "https://google.com/q="));
        // ....
    }

    public UserBannedErrorMessage getUserBannedMessage (String caseId) {
        return new UserBannedErrorMessage (caseId);
    }

}
