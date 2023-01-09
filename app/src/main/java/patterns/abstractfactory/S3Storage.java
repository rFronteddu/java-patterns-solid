package patterns.abstractfactory;

/**
 * Represents a concrete product in a family "Amazon Web Services"
 */
public class S3Storage implements Storage
{
    public S3Storage (final int capacityInMib) {
        // use aws s3 api
        System.out.println ("Allocated " + capacityInMib + " on S3");
    }

    @Override public String getId () {
        return "S31";
    }

    @Override public String toString () {
        return "S3 Storage";
    }
}
