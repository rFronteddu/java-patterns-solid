package patterns.creational.abstractfactory;

/**
 * Factory Implementation for aws cloud platform resources
 */
public class AwsResourceFactory implements ResourceFactory
{
    @Override public Instance createInstance (Instance.Capacity capacity) {
        return new Ec2Instance (capacity);
    }

    @Override public Storage createStorage (int capMib) {
        return new S3Storage (capMib);
    }
}
