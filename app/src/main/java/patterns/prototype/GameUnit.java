package patterns.prototype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * Represents an abstract prototype and defines the clone method
 */
public abstract class GameUnit implements Cloneable
{
    @Override public GameUnit clone () throws CloneNotSupportedException {
        // shallow or deep copy? In this case we can use a shallow copy Because position is immutable
        GameUnit unit = (GameUnit) super.clone ();
        unit.initialize ();
        return unit;
    }

    /**
     * reset state of new object
     */
    protected void initialize () {
        this.position = new Position (0, 0, 0);
        reset();
    }

    /**
     * handle custom reset logic from subclasses
     */
    protected abstract void reset();

    @AllArgsConstructor @ToString @Getter
    public static class Position
    {
        final int x;
        final int y;
        final int z;
    }

    @Getter
    private Position position;

    public GameUnit () {
        position = new Position (0, 0, 0);
    }

    public GameUnit (final int x, final int y, final int z) {
        position = new Position (x, y, z);
    }

    public void move (final int xDistance) {
        position = new Position (position.x + xDistance, position.y, position.z);
    }
}
