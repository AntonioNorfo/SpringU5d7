package antonio.u5d7.controllers;

import antonio.u5d7.Service.BlogPostService;
import antonio.u5d7.entities.BlogPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/blogposts")
public class BlogPostController {

    @Autowired
    private BlogPostService blogPostService;

    @GetMapping
    public List<BlogPost> getAllBlogPosts() {
        return blogPostService.getAllBlogPosts();
    }

    @GetMapping("/{id}")
    public Optional<BlogPost> getBlogPostById(@PathVariable UUID id) {
        return blogPostService.getBlogPostById(id);
    }

    @PostMapping
    public BlogPost createBlogPost(@RequestBody BlogPost blogPost) {
        return blogPostService.addBlogPost(blogPost);
    }


    @PutMapping("/{id}")
    public BlogPost updateBlogPost(@PathVariable UUID id, @RequestBody BlogPost updatedBlogPost) {
        return blogPostService.updateBlogPost(id, updatedBlogPost);
    }

    @DeleteMapping("/{id}")
    public void deleteBlogPost(@PathVariable UUID id) {
        blogPostService.deleteBlogPost(id);
    }
}
