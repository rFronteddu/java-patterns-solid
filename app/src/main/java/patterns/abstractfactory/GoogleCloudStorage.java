package patterns.abstractfactory;

/**
 * Represents a concrete product in a family "Google Cloud Platform"
 */
public class GoogleCloudStorage implements Storage
{
    public GoogleCloudStorage (final int capacityInMib) {
        // use aws s3 api
        System.out.println ("Allocated " + capacityInMib + " on Google Cloud Storage");
    }

    @Override public String getId () {
        return "gcps1";
    }

    @Override public String toString () {
        return "Google cloud Storage";
    }
}
