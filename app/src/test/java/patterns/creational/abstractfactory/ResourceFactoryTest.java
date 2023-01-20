package patterns.creational.abstractfactory;

import org.junit.Test;
import patterns.creational.abstractfactory.*;

import static org.junit.Assert.assertTrue;

public class ResourceFactoryTest
{
    public static class Client
    {
        private final ResourceFactory factory;

        Client (ResourceFactory factory) {
            this.factory = factory;
        }

        public Instance createServer (Instance.Capacity cap, int storageMib) {
            Instance instance = factory.createInstance (cap);
            Storage storage = factory.createStorage (storageMib);
            instance.attachStorage (storage);
            return instance;
        }
    }

    @Test public void factoryTest () {
        Client aws = new Client (new AwsResourceFactory ());
        var instance = aws.createServer (Instance.Capacity.large, 10_000);
        instance.start ();
        instance.stop ();
        assertTrue (instance.toString ().contains ("Ec2Instance"));
    }

    @Test public void factoryGoogleTest () {
        Client aws = new Client (new GoogleResourceFactory ());
        var instance = aws.createServer (Instance.Capacity.large, 10_000);
        instance.start ();
        instance.stop ();
        assertTrue (instance.toString ().contains ("ComputeInstance"));
    }
}