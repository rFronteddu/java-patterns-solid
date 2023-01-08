package patterns.factorymethod;

/**
 * Provides implementation for creating JSON messages. * Provides implementation for creating Text messages.
 */
public class TextMessageCreator extends MessageCreator
{
    @Override public Message createMessage () {
        return new TextMessage ();
    }
}
