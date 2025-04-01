package myproject.s29315tpo04blog.service;

import jakarta.transaction.Transactional;
import myproject.s29315tpo04blog.exception.UserNotFoundException;
import myproject.s29315tpo04blog.model.User;
import myproject.s29315tpo04blog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    public List<User> findUsersWithMoreThanArticles(int count) {
        return userRepository.findUsersWithMoreThanXArticles(count);
    }

    @Transactional
    public List<User> findAll() {
        return (List<User>) userRepository.findAll();
    }

    @Transactional
    public User update(User user) throws UserNotFoundException {
        User updatedUser = userRepository.findById(user.getId()).orElseThrow(UserNotFoundException::new);
        updatedUser.setUsername(user.getUsername());
        updatedUser.setEmail(user.getEmail());
        updatedUser.setArticles(user.getArticles());
        updatedUser.setRoles(user.getRoles());
        updatedUser.setBlog(user.getBlog());
        return userRepository.save(updatedUser);
    }

    @Transactional
    public Optional<User> findById(Long id){
        return userRepository.findById(id);
    }

    @Transactional
    public void deleteById(Long id){
        userRepository.findById(id).ifPresent(user -> {userRepository.delete(user);});
    }

    @Transactional
    public User save(User user){
        return userRepository.save(user);
    }

    @Transactional
    public Optional<User> searchUserByEmail(String email) {
        return Optional.ofNullable(userRepository.searchUserByEmail(email));
    }

    @Transactional
    public Optional<User> searchUserByUsername(String username) {
        return Optional.ofNullable(userRepository.searchUserByUsername(username));
    }
}
