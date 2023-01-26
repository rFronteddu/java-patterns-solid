package patterns.behavioral.nullobject;

import lombok.AllArgsConstructor;
import patterns.behavioral.interpreter.Report;

@AllArgsConstructor
public class ComplexService
{
    private final StorageService storage;
    private final String reportName;

    public ComplexService (final StorageService storage) {
        this.storage = storage;
        reportName = "A complex Report";
    }

    public void generateReport() {
        System.out.println ("Starting a complex report build");

        try {
            Thread.sleep (3000);
        }
        catch (InterruptedException e) {
            e.printStackTrace ();
        }

        System.out.println ("Done with report...");
        storage.save (new Report (reportName));
    }


}
