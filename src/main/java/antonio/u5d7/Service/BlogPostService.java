package antonio.u5d7.Service;

import antonio.u5d7.entities.BlogPost;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class BlogPostService {
    private List<BlogPost> blogPosts = new ArrayList<>();

    public List<BlogPost> getAllBlogPosts() {
        return blogPosts;
    }

    public Optional<BlogPost> getBlogPostById(UUID id) {
        return blogPosts.stream().filter(bp -> bp.getBlog_id().equals(id)).findFirst();
    }

    public BlogPost addBlogPost(BlogPost blogPost) {
        blogPost.setBlog_id(UUID.randomUUID());
        blogPost.setCover("https://picsum.photos/200/300");
        blogPosts.add(blogPost);
        return blogPost;
    }

    public BlogPost updateBlogPost(UUID id, BlogPost updatedBlogPost) {
        BlogPost blogPost = getBlogPostById(id).orElseThrow(() -> new RuntimeException("BlogPost non trovato"));
        blogPost.setTitolo(updatedBlogPost.getTitolo());
        blogPost.setContenuto(updatedBlogPost.getContenuto());
        blogPost.setCategoria(updatedBlogPost.getCategoria());
        blogPost.setTempoLettura(updatedBlogPost.getTempoLettura());
        return blogPost;
    }

    public void deleteBlogPost(UUID id) {
        blogPosts.removeIf(bp -> bp.getBlog_id().equals(id));
    }

    
}

