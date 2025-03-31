package myproject.s29315tpo04blog.repository;

import myproject.s29315tpo04blog.model.Role;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {

    Optional<Role> findByName(String name);

    @Query("SELECT r FROM Role r JOIN r.users u WHERE u.id = :id")
    List<Role> searchRoleByUsersId(@Param("id") Long id);
}
