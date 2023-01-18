package patterns.behavioral.iterator;

// Iterator interface allowing to iterate over the values of an aggregate
public interface Iterator <T>
{
    boolean hasNext ();

    T next ();
}
