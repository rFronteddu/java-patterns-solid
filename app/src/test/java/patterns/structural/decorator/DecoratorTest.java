package patterns.structural.decorator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DecoratorTest
{
    @Test public void decoratorTest () {
        Message m = new TextMessage ("The <FORCE> is strong with this one.");
        assertEquals (m.getContent (), "The <FORCE> is strong with this one.");
        Message decorator = new HtmlEncodedMessage (m);
        assertEquals (decorator.getContent (), "The &lt;FORCE&gt; is strong with this one.");
        decorator = new Base64EncodedMessage (decorator);
        assertEquals (decorator.getContent (), "VGhlICZsdDtGT1JDRSZndDsgaXMgc3Ryb25nIHdpdGggdGhpcyBvbmUu");
    }
}