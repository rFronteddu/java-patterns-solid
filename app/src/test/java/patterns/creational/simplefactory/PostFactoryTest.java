package patterns.creational.simplefactory;


import org.junit.Test;
import patterns.creational.simplefactory.Post;
import patterns.creational.simplefactory.PostFactory;

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