package patterns.structural.proxy.staticproxy;

import lombok.Getter;
import lombok.Setter;

/**
 * Concrete class providing actual functionalities
 */
public class BitmapImage implements Image
{
    @Setter @Getter
    private int location;
    private String name;

    public BitmapImage (final String filename) {
        System.out.println ("Loaded from disk: " + filename);
        name = filename;
    }

    @Override public void render () {
        System.out.println ("Rendered" + this.name);
    }
}
