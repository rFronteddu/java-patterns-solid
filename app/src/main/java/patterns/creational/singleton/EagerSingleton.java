package patterns.creational.singleton;

/**
 * Must prevent subclassing/inheritance because we can't control subclasses
 * Constructor must not be accessible globally
 * Keep track of the instance
 * Give access to the instance
 *
 * Instance created at class creation
 */
public class EagerSingleton
{
    private EagerSingleton() {

    }

    private static final EagerSingleton INSTANCE = new EagerSingleton ();

    public static EagerSingleton getInstance () {
        return INSTANCE;
    }
}
