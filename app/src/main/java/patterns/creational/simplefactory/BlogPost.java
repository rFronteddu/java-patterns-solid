package patterns.creational.simplefactory;


import lombok.Getter;
import lombok.Setter;

/**
 * Represents a blog post.
 */
@Setter @Getter
public class BlogPost extends Post
{
    private String author;
    private String[] tags;
}
