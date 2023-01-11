package patterns.structural.decorator;

import lombok.AllArgsConstructor;
import org.apache.commons.lang3.StringEscapeUtils;

/**
 * Decorator, Implements component interface
 */
@AllArgsConstructor
public class HtmlEncodedMessage implements Message
{
    private final Message message;

    @Override public String getContent () {
        // add functionality
        return StringEscapeUtils.escapeHtml4 (message.getContent ());
    }
}
