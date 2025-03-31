package myproject.s29315tpo04blog.service;

import myproject.s29315tpo04blog.model.Article;
import myproject.s29315tpo04blog.repository.ArticleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleService {
    private ArticleRepository articleRepository;

    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    public List<Article> getAllArticles() {
        return (List<Article>) articleRepository.findAll();
    }

    public Optional<Article> getArticleById(Long id) {
        return articleRepository.findById(id);
    }

    public void deleteById(Long id) {
        articleRepository.findById(id).ifPresent(articleRepository::delete);
    }

    public void save(Article article) {
        articleRepository.save(article);
    }

    public Article searchArticleByTitle(String title) {
        return articleRepository.searchArticleByTitle(title);
    }

    public List<Article> searchArticlesByAuthor_Id(Long author_id) {
        return articleRepository.searchArticlesByAuthor_Id(author_id);
    }

    public List<Article> searchArticlesByAuthor_username(String username) {
        return articleRepository.searchArticlesByAuthor_username(username);
    }
}
