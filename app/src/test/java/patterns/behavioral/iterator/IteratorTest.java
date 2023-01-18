package patterns.behavioral.iterator;

import org.junit.Test;

public class IteratorTest
{
    @Test public void iteratorTest() {
        Iterator<ThemeColor> iter = ThemeColor.getIterator();
        while (iter.hasNext ()) {
            System.out.println (iter.next ());
        }
    }
}