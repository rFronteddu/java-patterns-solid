package patterns.creational.simplefactory;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

/**
 * Represents a news post.
 */
@Getter @Setter
public class NewsPost extends Post
{
    private String headline;
    private LocalDate newsTime;
}
