package myproject.s29315tpo04blog.repository;

import myproject.s29315tpo04blog.model.Article;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleRepository extends CrudRepository<Article, Long> {
    List<Article> searchArticlesByAuthor_Id(Long author_id);
    Article searchArticleByTitle(String title);
    List<Article> searchArticlesByAuthor_username(String username);
}
