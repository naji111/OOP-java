package com.school.repository;

import com.school.model.User;

import java.util.List;

public interface UserRepository {
    void addUser(User user);

    List<User> getAllUsers();

    void updateUser(User user);

    void deleteUser(String username);

    User findUserByUsername(String username);
}
