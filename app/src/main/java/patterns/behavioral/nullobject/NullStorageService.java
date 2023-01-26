package patterns.behavioral.nullobject;

import patterns.behavioral.interpreter.Report;

public class NullStorageService extends StorageService
{
    @Override public void save(final Report report) {
        System.out.println ("Null object save method. Does nothing");
    }
}
