package patterns.structural.proxy.staticproxy;

/**
 * Proxy class, this is a virtual proxy implementation that creates the object until necessary.
 */
public class ImageProxy implements Image
{
    private BitmapImage image;
    private String name;
    private int location;

    public ImageProxy (final String name) {
        this.name = name;
    }


    @Override public void setLocation (final int location) {
        // if we don't have the object we need to hold this info
        if (image != null) {
            image.setLocation (location);
        } else {
            this.location = location;
        }
    }

    @Override public int getLocation () {
        if (image != null) {
            return image.getLocation ();
        } else {
            return location;
        }
    }

    @Override public void render () {
        if (image == null) {
            image = new BitmapImage (name);
            image.setLocation (location);
        }
        image.render ();
    }
}
