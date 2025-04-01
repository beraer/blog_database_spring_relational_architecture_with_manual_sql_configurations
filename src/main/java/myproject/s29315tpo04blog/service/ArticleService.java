package myproject.s29315tpo04blog.service;

import jakarta.transaction.Transactional;
import myproject.s29315tpo04blog.exception.ArticleNotFoundException;
import myproject.s29315tpo04blog.model.Article;
import myproject.s29315tpo04blog.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleService {
    private ArticleRepository articleRepository;

    @Autowired
    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @Transactional
    public List<Article> getAllArticles() {
        return (List<Article>) articleRepository.findAll();
    }

    @Transactional
    public Optional<Article> getArticleById(Long id) {
        return articleRepository.findById(id);
    }

    @Transactional
    public Article update(Article article) throws ArticleNotFoundException {
        Article updatedArticle = getArticleById(article.getId()).orElseThrow(ArticleNotFoundException::new);
        updatedArticle.setTitle(article.getTitle());
        updatedArticle.setContent(article.getContent());
        updatedArticle.setAuthor(article.getAuthor());
        updatedArticle.setBlog(article.getBlog());
        updatedArticle.setId(article.getId());
        return articleRepository.save(updatedArticle);
    }

    @Transactional
    public void deleteById(Long id) {
        articleRepository.findById(id).ifPresent(articleRepository::delete);
    }

    @Transactional
    public Article save(Article article) {
       return articleRepository.save(article);
    }

    @Transactional
    public Optional<List<Article>> searchArticlesByAuthor_Id(Long author_id) {
        return Optional.ofNullable(articleRepository.searchArticlesByAuthor_Id(author_id));
    }

    @Transactional
    public Optional<List<Article>> searchArticlesByAuthor_username(String username) {
        return Optional.ofNullable(articleRepository.searchArticlesByAuthor_username(username));
    }

    @Transactional
    public Optional<List<Article>> findArticleByAuthorRole(String roleName) {
        return Optional.ofNullable(articleRepository.findArticlesByAuthorRole(roleName));

    }
}
