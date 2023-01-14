package patterns.structural.proxy.dynamic;

import patterns.structural.proxy.staticproxy.BitmapImage;
import patterns.structural.proxy.staticproxy.Image;

import javax.swing.*;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Implement invocation handler.
 */
public class ImageInvocationHandler implements InvocationHandler
{
    private int location;
    private BitmapImage image;
    private String name;

    final Method setLocation;
    final Method getLocation;
    final Method render;

    public ImageInvocationHandler (final String name) throws NoSuchMethodException {
        this.name = name;
        render = Image.class.getMethod ("render");
        getLocation = Image.class.getMethod ("getLocation");
        setLocation = Image.class.getMethod ("setLocation", int.class);
    }

    @Override public Object invoke (Object proxy, Method method, Object[] args) throws Throwable {

        if (method.equals (setLocation)) {
            handleSetLocation ((int) args[0]);
        } else if (method.equals (getLocation)) {
            return handleGetLocation ();
        } else if (method.equals (render)) {
            handleRender ();
        }
        return null;
    }

    private Object handleRender () {
        if (image == null) {
            image = new BitmapImage (name);
            image.setLocation (location);
        }
        image.render ();
        return null;
    }

    private void handleSetLocation (final int location) {
        if (image != null) {
            image.setLocation (location);
        } else {
            this.location = location;
        }
    }

    private Integer handleGetLocation () {
        if (image != null) {
            return image.getLocation ();
        } else {
            return this.location;
        }
    }
}
