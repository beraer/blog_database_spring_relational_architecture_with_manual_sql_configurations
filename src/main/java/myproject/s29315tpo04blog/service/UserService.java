package myproject.s29315tpo04blog.service;

import jakarta.transaction.Transactional;
import myproject.s29315tpo04blog.model.User;
import myproject.s29315tpo04blog.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private UserRepository userRepository;

    @Transactional
    public List<User> findAll() {
        return (List<User>) userRepository.findAll();
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
    public User searchUserByEmail(String email) {
        return userRepository.searchUserByEmail(email);
    }

    @Transactional
    public User searchUserByUsername(String username) {
        return userRepository.searchUserByUsername(username);
    }
    @Transactional
    public User searchUserByIdIs(Long id){
        return userRepository.searchUserByIdIs(id);
    }
}
