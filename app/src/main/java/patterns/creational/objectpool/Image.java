package patterns.creational.objectpool;

/**
 * Represents our abstract reusable
 */
public interface Image extends Poolable
{
    void draw ();

    int getLocation ();

    void setLocation (int location);
}
