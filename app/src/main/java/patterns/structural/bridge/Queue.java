package patterns.structural.bridge;

/**
 * a refined abstraction
 */
public class Queue <T> implements FifoCollection<T>
{
    private final LinkedList<T> list;

    public Queue (final LinkedList<T> list) {
        this.list = list;
    }

    @Override public void offer (final T element) {
        list.addLast (element);
    }

    @Override public T poll () {
        return list.removeFirst ();
    }
}
