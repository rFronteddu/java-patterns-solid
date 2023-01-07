package patterns.simplefactory;


import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PostFactoryTest
{
    @Test public void createPostTest () {
        Post post = PostFactory.createPost ("blog");
        assertTrue (post.toString ().contains ("BlogPost"));

        post = PostFactory.createPost ("news");
        assertTrue (post.toString ().contains ("NewsPost"));
    }
}