package myproject.s29315tpo04blog.repository;

import myproject.s29315tpo04blog.model.Blog;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogRepository extends CrudRepository<Blog, Long> {

    @Query("SELECT b FROM Blog b WHERE SIZE(b.articles) > :count")
    List<Blog> findBlogsWithMoreThanXArticles(int count);

    Blog findBlogByName(String name);
}
