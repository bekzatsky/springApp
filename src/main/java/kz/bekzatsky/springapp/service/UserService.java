package kz.bekzatsky.springapp.service;

import kz.bekzatsky.springapp.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void saveUser(User user);

    void updateUser(User user);

    User getUserById(int id);

    void deleteUserById(int id);
}
