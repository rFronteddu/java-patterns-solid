package patterns.prototype;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameUnitTest
{
    @Test public void creationTest () throws CloneNotSupportedException {
        Swordsman s1 = new Swordsman ();
        s1.move (50);
        var s2 = s1.clone ();
        assertEquals (s1.getPosition ().getX (), 50);
        assertEquals (s2.getPosition ().getX (), 0);


    }
}