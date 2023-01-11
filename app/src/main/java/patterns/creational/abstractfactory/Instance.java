package patterns.creational.abstractfactory;

/**
 * Represents an abstract product
 */
public interface Instance
{
    enum Capacity
    {micro, small, large}

    void start ();

    void attachStorage (final Storage storage);

    void stop ();
}
