package patterns.structural.proxy.staticproxy;

/**
 * Factory to get image objects
 */
public class ImageFactory
{
    // we provide a proxy to caller instead of a real object

    public static Image getImage (final String name) {
        return new ImageProxy (name);
    }
}
