package patterns.creational.objectpool;

import org.junit.Test;
import patterns.creational.objectpool.Bitmap;
import patterns.creational.objectpool.ObjectPool;

import static org.junit.Assert.assertEquals;


public class ObjectPoolTest
{
    @Test public void objectPoolTest () {
        ObjectPool<Bitmap> bitmapPool = new ObjectPool<> (() -> new Bitmap ("logo.bmp"), 5);
        var b1 = bitmapPool.get ();
        b1.setLocation (5);
        assertEquals (b1.getLocation (), 5);
        bitmapPool.get ();
        bitmapPool.get ();
        bitmapPool.get ();
        bitmapPool.get ();
        bitmapPool.release (b1);
        var b2 = bitmapPool.get ();
        assertEquals (b1, b2);
        assertEquals (b2.getLocation (), 0);
    }
}