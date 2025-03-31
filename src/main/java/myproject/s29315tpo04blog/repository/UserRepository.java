package myproject.s29315tpo04blog.repository;

import myproject.s29315tpo04blog.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User searchUserByEmail(String email);
    User searchUserByUsername(String username);
    User searchUserByIdIs(Long id);
}
