package patterns.structural.proxy.dynamic;

import patterns.structural.proxy.staticproxy.Image;

import java.lang.reflect.Proxy;

public class DynamicImageFactory
{
    public static Image getImage (final String name) throws NoSuchMethodException {
        return (Image) Proxy.newProxyInstance (
                DynamicImageFactory.class.getClassLoader (),
                new Class[]{Image.class},
                new ImageInvocationHandler (name));
    }
}
