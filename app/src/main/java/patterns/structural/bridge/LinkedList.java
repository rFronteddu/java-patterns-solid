package patterns.structural.bridge;

/**
 *
 * This is the implementor. This is also an interface as implementor
 * is defining its own hierarchy which is not related
 * to the abstraction hierarchy.
 */
public interface LinkedList<T>
{
    void addFirst(T element);

    T removeFirst();

    void addLast(T element);

    T removeLast();

    int getSize();
}
