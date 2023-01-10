package patterns.singleton;

/**
 * Singleton pattern using lazy initialization holder class.
 * This ensures that, wee have a lazy initialization without worrying
 * about synchronization.
 */
public class LazySingletonRegistryIODH
{
    private LazySingletonRegistryIODH () {}

    // This inner class is only loaded when getInstance is called.
    // Moreover, classLoading is thread safe.
    private static class RegistryHolder {
        static LazySingletonRegistryIODH INSTANCE = new LazySingletonRegistryIODH ();
    }

    public static LazySingletonRegistryIODH getInstance() {
        return RegistryHolder.INSTANCE;
    }
}
