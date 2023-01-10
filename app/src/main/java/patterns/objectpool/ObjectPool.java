package patterns.objectpool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Supplier;

/**
 * Must provide a thread-safe caching mechanism of objects
 * Must provide methods to acquire and release objects
 * Cached objects should be reset before releasing
 * Reusable objects must provide method to reset themselves
 */
public class ObjectPool <T extends Poolable>
{
    private BlockingQueue<T> availablePool;

    public ObjectPool (final Supplier<T> creator, final int count) {
        availablePool = new LinkedBlockingQueue<> ();
        for (int i = 0; i < count; i++) {
            availablePool.offer (creator.get ());
        }
    }

    public T get () {
        try {
            // we can wait indefinitely or create a new object if the queue is empty,
            // in this implementation we wait indefinitely
            return availablePool.take ();
        }
        catch (InterruptedException ex) {
            System.err.println ("take() was interrupted");
        }
        return null;
    }

    public void release (final T object) {
        object.reset ();
        availablePool.offer (object);
    }

}
