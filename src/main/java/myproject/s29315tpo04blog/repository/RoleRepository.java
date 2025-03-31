package myproject.s29315tpo04blog.repository;

import myproject.s29315tpo04blog.model.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
    Role searchRoleByUsername(String username);
    Role searchRoleByUserId(Long id);
    Role searchRoleByEmail(String email);
}
