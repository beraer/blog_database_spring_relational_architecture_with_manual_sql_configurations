package myproject.s29315tpo04blog.exception;

public class ArticleNotFoundException extends Exception {
    public ArticleNotFoundException() {
        super("Article not found");
    }
}
