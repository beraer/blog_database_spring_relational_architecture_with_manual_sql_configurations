package myproject.s29315tpo04blog.controller;

import myproject.s29315tpo04blog.exception.BlogNotFoundException;
import myproject.s29315tpo04blog.model.Blog;
import myproject.s29315tpo04blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BlogController {
    private BlogService blogService;

    @Autowired
    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }

    public Blog getBlogById(Long blogId) throws BlogNotFoundException {
        return blogService.getBlogById(blogId).orElseThrow(BlogNotFoundException::new);
    }

    public List<Blog> getAllBlogs() {
        return blogService.getAllBlogs();
    }

    public void deleteBlogById(Long blogId){
        blogService.deleteBlogById(blogId);
    }

    public void saveBlog(Blog blog) {
        blogService.save(blog);
    }

}
