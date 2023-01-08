package patterns.factorymethod;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MessageCreatorTest
{
    @Test public void creatorTest () {
        checkMessage (new JSONMessageCreator (), "JSONMessage");
        checkMessage (new TextMessageCreator (), "TextMessage");
    }

    public static void checkMessage (final MessageCreator creator, final String type) {
        assertTrue (creator.getMessage ().toString ().contains (type));
    }
}