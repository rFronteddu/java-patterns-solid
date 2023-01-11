package patterns.creational.abstractfactory;

/**
 * Represents a concrete product in a family "Google Cloud Platform"
 */
public class GoogleComputeEngineInstance implements Instance
{
    public GoogleComputeEngineInstance (final Capacity capacity) {
        // map capacity to ec2 instance types. Use aws API to provision
        System.out.println ("Created GoogleInstance");
    }

    @Override public void start () {
        System.out.println ("Compute engine instance started");
    }

    @Override public void attachStorage (final Storage storage) {
        System.out.println ("Attached " + storage + " to Compute engine Instance");
    }

    @Override public void stop () {
        System.out.println ("Compute engine instance Stopped");
    }

    @Override public String toString () {
        return "ComputeInstance";
    }
}
