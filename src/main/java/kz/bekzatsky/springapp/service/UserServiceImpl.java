package kz.bekzatsky.springapp.service;

import kz.bekzatsky.springapp.entity.User;
import kz.bekzatsky.springapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    public void saveUser(User user) {
        userRepository.saveUser(user);
    }

    public void updateUser(User user) {
        userRepository.updateUser(user);
    }

    public User getUserById(int id) {
        return userRepository.getUserById(id);
    }

    public void deleteUserById(int id) {
        userRepository.deleteUserById(id);
    }
}
