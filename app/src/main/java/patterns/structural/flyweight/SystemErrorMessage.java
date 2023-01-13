package patterns.structural.flyweight;

import lombok.AllArgsConstructor;

/**
 * A concrete flyweight. Instance is shared
 */
@AllArgsConstructor
public class SystemErrorMessage implements ErrorMessage
{
    // shared properties
    // some error message $errorCode
    private String messageTemplate;
    // //http:somedomain.com/help?errors=
    private String helpUrlBase;

    @Override public String getText (final String code) {
        // code is the extrinsic state
        return messageTemplate.replace ("$errorCode", code) + helpUrlBase + code;
    }
}
