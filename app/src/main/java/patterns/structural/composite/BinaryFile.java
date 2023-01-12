package patterns.structural.composite;

/**
 * Leaf node in composite pattern
 */
public class BinaryFile extends File
{
    private long size;

    public BinaryFile (final String name, final long size) {
        super (name);
        this.size = size;
    }

    // these methods are not meant for the leaf, drawback of
    // having child management operations in the leaf
    @Override public void ls () {
        System.out.println (getName () + "\t" + size);
    }

    @Override public void addFile (final File file) {
        throw new UnsupportedOperationException ("Leaf node doesn't support add operation");
    }

    @Override public File[] getFiles () {
        throw new UnsupportedOperationException ("Leaf node doesn't support add operation");
    }

    @Override public boolean remoteFile (File file) {
        throw new UnsupportedOperationException ("Leaf node doesn't support add operation");
    }
}
