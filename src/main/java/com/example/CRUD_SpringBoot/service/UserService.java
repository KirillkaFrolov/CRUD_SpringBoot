package com.example.CRUD_SpringBoot.service;

import com.example.CRUD_SpringBoot.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void addUser(User user);

    void updateUser(User user);

    User getUserId(long id);

    User removeUser(long id);

}
