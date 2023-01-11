package patterns.structural.bridge;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QueueTest
{
    @Test public void queueSinglyTest () {
        FifoCollection<Integer> collection = new Queue<> (new SinglyLinkedList<> ());
        collection.offer (2);
        collection.offer (6);
        assertEquals ((long) collection.poll (), 2);
        assertEquals ((long) collection.poll (), 6);
    }

    @Test public void queueArrayTest () {
        FifoCollection<Integer> collection = new Queue<> (new ArrayLinkedList<> ());
        collection.offer (2);
        collection.offer (6);
        assertEquals ((long) collection.poll (), 2);
        assertEquals ((long) collection.poll (), 6);
    }
}