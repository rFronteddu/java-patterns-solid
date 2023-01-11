package patterns.structural.decorator;

import lombok.AllArgsConstructor;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

@AllArgsConstructor
public class Base64EncodedMessage implements Message
{
    private Message message;

    @Override public String getContent () {
        return Base64.getEncoder ().encodeToString (message.getContent ().getBytes(StandardCharsets.UTF_8));
    }
}
