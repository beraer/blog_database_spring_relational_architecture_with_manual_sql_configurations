package myproject.s29315tpo04blog.controller;

import myproject.s29315tpo04blog.exception.ArticleNotFoundException;
import myproject.s29315tpo04blog.model.Article;
import myproject.s29315tpo04blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


import java.util.List;

@Controller
public class ArticleController {
    private ArticleService articleService;

    @Autowired
    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

     
    public List<Article> getAllArticles() {
        return articleService.getAllArticles();
    }

     
    public Article getArticleById(Long id) throws ArticleNotFoundException {
        return articleService.getArticleById(id).orElseThrow(ArticleNotFoundException::new);
    }

     
    public void deleteArticleById(Long id) {
        articleService.deleteById(id);
    }

     
    public void addArticle(Article article) {
        articleService.save(article);
    }

     
    public List<Article> searchArticlesByAuthor_Id(Long author_id) throws ArticleNotFoundException {
        return articleService.searchArticlesByAuthor_Id(author_id).orElseThrow(ArticleNotFoundException::new);
    }

     
    public List<Article> searchArticlesByAuthor_username(String username) throws ArticleNotFoundException {
        return articleService.searchArticlesByAuthor_username(username).orElseThrow(ArticleNotFoundException::new);
    }

     
    public List<Article> searchArticlesByAuthor_role(String roleName) throws ArticleNotFoundException {
        return articleService.findArticleByAuthorRole(roleName).orElseThrow(ArticleNotFoundException::new);
    }


}
