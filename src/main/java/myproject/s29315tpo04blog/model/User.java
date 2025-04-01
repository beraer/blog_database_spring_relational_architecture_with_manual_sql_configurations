package myproject.s29315tpo04blog.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String email;

    private String username;

    @OneToMany(mappedBy = "author", fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    private Set<Article> articles = new HashSet<>();

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id")
    )
    private Set<Role> roles = new HashSet<>();

    @OneToOne(mappedBy = "manager", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Blog blog;

    public User() {}

    public User(String email, String username) {
        this.email = email;
        this.username = username;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setArticles(Set<Article> articles) {
        this.articles = articles;
    }

    public Set<Article> getArticles() {
        return articles;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setusername(String username) {
        this.username = username;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public String getUsername() {
        return username;
    }

    public Blog getBlog() {
        return blog;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }
}
