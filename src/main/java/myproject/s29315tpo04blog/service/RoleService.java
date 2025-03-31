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

    public List<Role> searchRoleByUsername(String username) {
        return (List<Role>) roleRepository.searchRoleByUsername(username);
    }

    public List<Role> searchRoleByEmail(String email) {
        return (List<Role>) roleRepository.searchRoleByEmail(email);
    }

    public List<Role> searchRoleByUserId(Long userId) {
        return (List<Role>) roleRepository.searchRoleByUserId(userId);
    }
}
