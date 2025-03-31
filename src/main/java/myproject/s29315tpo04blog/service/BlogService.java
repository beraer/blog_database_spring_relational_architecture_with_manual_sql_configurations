package myproject.s29315tpo04blog.service;

import myproject.s29315tpo04blog.model.Blog;
import myproject.s29315tpo04blog.repository.BlogRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogService {
    private BlogRepository blogRepository;
    public BlogService(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }
    public List<Blog> getAllBlogs() {
        return (List<Blog>) blogRepository.findAll();
    }

    public Optional<Blog> getBlogById(Long id) {
        return blogRepository.findById(id);
    }

    public void deleteBlogById(Long id) {
        blogRepository.findById(id).ifPresent(blogRepository::delete);
    }

    public void save(Blog blog) {
        blogRepository.save(blog);
    }
}
