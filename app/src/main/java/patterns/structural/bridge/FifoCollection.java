package patterns.structural.bridge;

/**
 * Abstraction, represents a First in First Out collection
 * @param <T>
 */
public interface FifoCollection <T>
{
    void offer (T element);

    T poll ();
}
