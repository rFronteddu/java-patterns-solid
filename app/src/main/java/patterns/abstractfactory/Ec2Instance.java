package patterns.abstractfactory;

/**
 * Represents a concrete product in a family "Amazon Web Services"
 */
public class Ec2Instance implements Instance
{
    public Ec2Instance(Capacity capacity) {
        // map capacity to ec2 instance types. Use aws API to provision
        System.out.println ("Created Ec2Instance");
    }

    @Override public void start () {
        System.out.println ("Ec2Instance started");
    }

    @Override public void attachStorage (Storage storage) {
        System.out.println ("Attached " + storage + " to Ec2Instance");
    }

    @Override public void stop () {
        System.out.println ("Ec2Instance Stopped");
    }

    @Override public String toString () {
        return "Ec2Instance";
    }
}
