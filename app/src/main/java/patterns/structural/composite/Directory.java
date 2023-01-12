package patterns.structural.composite;



import java.util.ArrayList;
import java.util.List;

/**
 * Composite in the composite pattern
 */
public class Directory extends File
{
    private final List<File> children = new ArrayList<> ();

    public Directory (final String name) {
        super (name);
    }

    @Override public void ls () {
        System.out.println (getName ());
        children.forEach (File::ls);
    }

    @Override public void addFile (final File file) {
        children.add (file);
    }

    @Override public File[] getFiles () {
        // In older Java versions using pre-sized array was
        // recommended, as the reflection call which is necessary
        // to create an array of proper size was quite slow.
        // However, since late updates of OpenJDK 6 this call
        // was made intrinsic, making the performance of the
        // empty array version the same and sometimes even better,
        // compared to the pre-sized version.
        // Also passing pre-sized array is dangerous for a
        // concurrent or synchronized collection as a data
        // race is possible between the size and toArray call
        // which may result in extra nulls at the end of the
        // array, if the collection was concurrently shrunk
        // during the operation. This inspection allows to
        // follow the uniform style: either using an empty
        // array (which is recommended in modern Java) or using
        // a pre-sized array (which might be faster in older
        // Java versions or non-HotSpot based JVMs).
        return children.toArray (new File[0]);
    }

    @Override public boolean remoteFile (File file) {
        return children.remove (file);
    }
}
