package myproject.s29315tpo04blog.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "blogs")
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User manager;

    @OneToMany(mappedBy = "blog", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Article> articles = new HashSet<>();

    public Blog() {}

    public Blog(String name) {
        this.name = name;
    }


    public Long getId() {
        return id;
    }

    public User getUser() {
        return manager;
    }

    public String getname() {
        return name;
    }

    public Set<Article> getArticles() {
        return articles;
    }

    public void setArticles(Set<Article> articles) {
        this.articles = articles;
    }

    public void setUser(User manager) {
        this.manager = manager;
    }

    public void setname(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
