package myproject.s29315tpo04blog.service;

import jakarta.transaction.Transactional;
import myproject.s29315tpo04blog.model.Role;
import myproject.s29315tpo04blog.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleService {
    private RoleRepository roleRepository;

    @Autowired
    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Transactional
    public List<Role> findAll() {
        return (List<Role>) roleRepository.findAll();
    }

    @Transactional
    public Optional<Role> findById(Long id) {
        return roleRepository.findById(id);
    }

    @Transactional
    public void deleteById(Long id) {
        roleRepository.findById(id).ifPresent(roleRepository::delete);
    }

    @Transactional
    public void save(Role role) {
        roleRepository.save(role);
    }

    public Optional<Role> findByName(String name) {
        return roleRepository.findByName(name);
    }

    public Optional<List<Role>> searchRoleByUserId(Long userId) {
        return Optional.ofNullable(roleRepository.searchRoleByUsersId(userId));
    }
}
