package patterns.behavioral.nullobject;


import org.junit.Test;

public class NullObjectTest
{
    @Test public void nullObjectTest () {
        ComplexService service = new ComplexService (new StorageService (), "Simple Report");
        service.generateReport ();

        service = new ComplexService (new NullStorageService (), "Null Report");
        service.generateReport ();
    }
}