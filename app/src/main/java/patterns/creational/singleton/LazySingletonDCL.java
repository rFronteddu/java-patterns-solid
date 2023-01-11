package patterns.creational.singleton;

/**
 * This class demonstrates singleton pattern using Double-Checked Locking or "classic" singleton.
 * This is also a lazy initializing singleton.
 *
 * Although this implementation solves the multi-threading issue with lazy initialization using volatile
 * and double check locking, the volatile keyword is guaranteed
 * to work only after JVMs v1.5 and later.
 */
public class LazySingletonDCL
{
    private LazySingletonDCL () {}

    // avoid using caching of variable using volatile
    private static volatile LazySingletonDCL INSTANCE;

    static public LazySingletonDCL getInstance () {
        // optimization check once instance is made
        if (INSTANCE == null) {
            synchronized (LazySingletonDCL.class) {
                if (INSTANCE == null) {
                    INSTANCE = new LazySingletonDCL ();
                }
            }

        }
        return INSTANCE;
    }
}
