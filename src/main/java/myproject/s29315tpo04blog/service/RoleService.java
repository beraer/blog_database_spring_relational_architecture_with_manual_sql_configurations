package myproject.s29315tpo04blog.service;

import jakarta.transaction.Transactional;
import myproject.s29315tpo04blog.exception.RoleNotFoundException;
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
    public Role update(Role role) throws RoleNotFoundException {
        Role updatedRole = findById(role.getId()).orElseThrow(RoleNotFoundException::new);
        updatedRole.setName(role.getName());
        updatedRole.setId(role.getId());
        updatedRole.setUsers(role.getUsers());
        return roleRepository.save(updatedRole);
    }

    @Transactional
    public void deleteById(Long id) {
        roleRepository.findById(id).ifPresent(roleRepository::delete);
    }

    @Transactional
    public void save(Role role) {
        roleRepository.save(role);
    }

    @Transactional
    public Optional<Role> findByName(String name) {
        return roleRepository.findByName(name);
    }

    @Transactional
    public Optional<List<Role>> searchRoleByUserId(Long userId) {
        return Optional.ofNullable(roleRepository.searchRoleByUsersId(userId));
    }

    @Transactional
    public Optional<List<Role>> searchRoleByUserEmail(String email) {
        return Optional.ofNullable(roleRepository.findRolesByUserEmail(email));
    }
}
