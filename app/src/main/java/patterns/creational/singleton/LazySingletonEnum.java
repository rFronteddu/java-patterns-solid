package patterns.creational.singleton;

import lombok.Getter;
import lombok.Setter;

/**
 * Ref. Google I/O Joshua Bloch
 * >Java1.5 using enum we can create a singleton. It handles serialization using
 *  java built-in mechanism and still ensures the presence of a single instance
 *
 *  Note that enums cannot be extended.
 */
public enum LazySingletonEnum
{
    INSTANCE;

    @Getter @Setter
    int value;
}
