package patterns.structural.proxy.staticproxy;

// interface implemented by the proxy and concrete objects
public interface Image
{
    void setLocation (int location);

    int getLocation ();

    void render ();
}
