package myproject.s29315tpo04blog.controller;

import myproject.s29315tpo04blog.exception.RoleNotFoundException;
import myproject.s29315tpo04blog.model.Role;
import myproject.s29315tpo04blog.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoleController {
    private RoleService roleService;

    @Autowired
    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    public List<Role> findAll() {
        return roleService.findAll();
    }

    public Role findById(Long id) throws RoleNotFoundException {
        return roleService.findById(id).orElseThrow(RoleNotFoundException::new);
    }

    public void save(Role role) {
        roleService.save(role);
    }

    public void deleteById(Long id){
        try{
            roleService.deleteById(id);
        }catch (Exception e){ e.printStackTrace(); }
    }

    public Role findByName(String name) throws RoleNotFoundException {
        return roleService.findByName(name).orElseThrow(RoleNotFoundException::new);
    }

    public Role findByUserId(Long userId) throws RoleNotFoundException {
        return (Role) roleService.searchRoleByUserId(userId).orElseThrow(RoleNotFoundException::new);
    }


}
