package patterns.structural.proxy;

import org.junit.Test;
import patterns.structural.proxy.dynamic.DynamicImageFactory;
import patterns.structural.proxy.staticproxy.Image;
import patterns.structural.proxy.staticproxy.ImageFactory;

import static org.junit.Assert.assertEquals;

public class ImageFactoryTest
{
    @Test public void imgFactoryTest () {
        Image img = ImageFactory.getImage ("A1.bpm");
        img.setLocation (1234);
        assertEquals (img.getLocation (), 1234);
        // only when render is called the real img is created/loaded
        img.render ();
    }

    @Test public void dynamicImgFactoryTest () throws NoSuchMethodException {
        Image img = DynamicImageFactory.getImage ("img1.bmp");
        img.setLocation (1234);
        assertEquals (img.getLocation (), 1234);
        img.render ();
    }
}