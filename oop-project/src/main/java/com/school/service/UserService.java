package com.school.service;

import com.school.model.User;
import com.school.repository.UserRepository;

import java.util.List;

public class UserService {
    private final UserRepository userRepository;

    private static UserService instance;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public static synchronized UserService getInstance(UserRepository userRepository) {
            if (instance == null) {
                instance = new UserService(userRepository);
            }
            return instance;
        }






    // Add User
    public void addUser(User user) {
        userRepository.addUser(user);
    }

    // Get All Users
    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    // Update User
    public void updateUser(User user) {
        userRepository.updateUser(user);
    }

    // Delete User
    public void deleteUser(String username) {
        userRepository.deleteUser(username);
    }

    // Find User by Username
    public User findUserByUsername(String username) {
        return userRepository.findUserByUsername(username);
    }

    // Validate User Credentials
    public boolean validateCredentials(String username, String password) {
        User user = userRepository.findUserByUsername(username);
        return user != null && user.getPassword().equals(password);
    }
}
