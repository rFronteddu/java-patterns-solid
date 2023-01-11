package patterns.creational.objectpool;

import lombok.Setter;

/**
 * concrete reusable
 */
public class Bitmap implements Image
{
    @Setter
    private int location;

    private String name;

    public Bitmap (final String name) {
        this.name = name;
    }

    @Override public void draw () {
        System.out.println ("Drawing " + name + " @ " + location);
    }

    @Override public int getLocation () {
        return location;
    }

    @Override public void reset () {
        location = 0;
        System.out.println ("Bitmat was reset");
    }
}
