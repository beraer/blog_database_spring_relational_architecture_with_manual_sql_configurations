package myproject.s29315tpo04blog.controller;

import jakarta.transaction.Transactional;
import myproject.s29315tpo04blog.exception.ArticleNotFoundException;
import myproject.s29315tpo04blog.model.Article;
import myproject.s29315tpo04blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ArticleController {
    private ArticleService articleService;

    @Autowired
    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @Transactional
    public List<Article> getAllArticles() {
        return articleService.getAllArticles();
    }

    @Transactional
    public Article getArticleById(Long id) throws ArticleNotFoundException {
        return articleService.getArticleById(id).orElseThrow(ArticleNotFoundException::new);
    }

    @Transactional
    public void deleteArticleById(Long id) {
        articleService.deleteById(id);
    }

    @Transactional
    public void addArticle(Article article) {
        articleService.save(article);
    }

    @Transactional
    public List<Article> searchArticlesByAuthor_Id(Long author_id) throws ArticleNotFoundException {
        return articleService.searchArticlesByAuthor_Id(author_id).orElseThrow(ArticleNotFoundException::new);
    }

    @Transactional
    public List<Article> searchArticlesByAuthor_username(String username) throws ArticleNotFoundException {
        return articleService.searchArticlesByAuthor_username(username).orElseThrow(ArticleNotFoundException::new);
    }


}
