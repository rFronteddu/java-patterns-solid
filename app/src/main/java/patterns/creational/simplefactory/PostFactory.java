package patterns.creational.simplefactory;

/**
 * This class is our simple factory example for creation of
 * different posts on a website
 */
public class PostFactory
{
    public static Post createPost (final String type) {
        switch (type) {
            case "blog":
                return new BlogPost ();
            case "news":
                return new NewsPost ();
            case "product":
                return new ProductPost ();
            default:
                throw new IllegalArgumentException ("Post type is unknown");
        }
    }
}
