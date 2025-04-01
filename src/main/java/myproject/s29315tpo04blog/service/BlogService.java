package myproject.s29315tpo04blog.service;

import jakarta.transaction.Transactional;
import myproject.s29315tpo04blog.exception.BlogNotFoundException;
import myproject.s29315tpo04blog.model.Blog;
import myproject.s29315tpo04blog.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogService {
    private BlogRepository blogRepository;

    @Autowired
    public BlogService(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    @Transactional
    public List<Blog> getAllBlogs() {
        return (List<Blog>) blogRepository.findAll();
    }

    @Transactional
    public Blog update(Blog blog) throws BlogNotFoundException {
        Blog updatedBlog = getBlogById(blog.getId()).orElseThrow(BlogNotFoundException::new);
        updatedBlog.setArticles(blog.getArticles());
        updatedBlog.setId(blog.getId());
        updatedBlog.setname(blog.getname());
        updatedBlog.setUser(blog.getUser());
        return blogRepository.save(updatedBlog);
    }

    @Transactional
    public Optional<List<Blog>> findBlogsWithMoreThanXArticles(int count) {
        return Optional.ofNullable(blogRepository.findBlogsWithMoreThanXArticles(count));
    }

    @Transactional
    public Optional<Blog> searchBlogByName(String name) {
        return  Optional.ofNullable(blogRepository.findBlogByName(name));
    }

    @Transactional
    public Optional<Blog> getBlogById(Long id) {
        return blogRepository.findById(id);
    }

    @Transactional
    public void deleteBlogById(Long id) {
        blogRepository.findById(id).ifPresent(blogRepository::delete);
    }

    @Transactional
    public void save(Blog blog) {
        blogRepository.save(blog);
    }
}
