package patterns.structural.composite;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Component base class for composite pattern
 * Defines operations applicable both leaf and composite
 */
@AllArgsConstructor
public abstract class File
{
    @Getter
    @Setter
    private String name;

    public abstract void ls ();

    public abstract void addFile (File file);

    public abstract File[] getFiles ();

    public abstract boolean remoteFile (File file);
}
