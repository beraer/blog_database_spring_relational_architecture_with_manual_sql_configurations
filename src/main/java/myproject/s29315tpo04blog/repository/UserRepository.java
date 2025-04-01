package myproject.s29315tpo04blog.repository;

import myproject.s29315tpo04blog.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    @Query("SELECT u FROM User u WHERE SIZE(u.articles) > :count")
    List<User> findUsersWithMoreThanXArticles(int count);

    User searchUserByEmail(String email);
    User searchUserByUsername(String username);
    User searchUserByIdIs(Long id);
}
