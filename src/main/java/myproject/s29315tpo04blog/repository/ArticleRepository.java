package myproject.s29315tpo04blog.repository;

import myproject.s29315tpo04blog.model.Article;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends CrudRepository<Article, Long> {
}
