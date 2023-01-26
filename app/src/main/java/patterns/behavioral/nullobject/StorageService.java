package patterns.behavioral.nullobject;

import patterns.behavioral.interpreter.Report;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class StorageService
{
    public void save (final Report report) {
        System.out.println ("Writing report out");
        try(final PrintWriter writer = new PrintWriter (report.getName () + ".txt")) {
            writer.println (report.getName ());
        }
        catch (FileNotFoundException e) {
            e.printStackTrace ();
        }
    }
}
