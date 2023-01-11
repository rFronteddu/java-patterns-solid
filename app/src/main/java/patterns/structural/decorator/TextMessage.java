package patterns.structural.decorator;

import lombok.AllArgsConstructor;

/**
 * Concrete component. Object to be decorated
 */
@AllArgsConstructor
public class TextMessage implements Message
{
    private String message;

    @Override public String getContent () {
        return message;
    }
}
