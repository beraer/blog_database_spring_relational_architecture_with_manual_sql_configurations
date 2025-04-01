package myproject.s29315tpo04blog.controller;

import myproject.s29315tpo04blog.exception.UserNotFoundException;
import myproject.s29315tpo04blog.model.User;
import myproject.s29315tpo04blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    public List<User> getAllUser(){
        return userService.findAll();
    }

    public User getUserById(Long id) throws UserNotFoundException {
        return userService.findById(id).orElseThrow(UserNotFoundException::new);
    }

    public User getUserByUsername(String username) throws UserNotFoundException {
        return userService.searchUserByUsername(username).orElseThrow(UserNotFoundException::new);
    }

    public User getUserByEmail(String email) throws UserNotFoundException {
        return userService.searchUserByEmail(email).orElseThrow(UserNotFoundException::new);
    }

    public void saveUser(User user) {
        userService.save(user);
    }

    public void deleteUser(Long id) {
        userService.deleteById(id);
    }
}
