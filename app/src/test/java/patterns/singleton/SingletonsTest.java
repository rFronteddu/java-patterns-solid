package patterns.singleton;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SingletonsTest
{
    @Test public void lazyTest () {
        assertEquals (LazySingletonDCL.getInstance (), LazySingletonDCL.getInstance ());
    }

    @Test public void lazyTest2 () {
        assertEquals (LazySingletonRegistryIODH.getInstance (), LazySingletonRegistryIODH.getInstance ());
    }

    @Test public void eagerTest () {
        assertEquals (EagerSingleton.getInstance (), EagerSingleton.getInstance ());
    }
}