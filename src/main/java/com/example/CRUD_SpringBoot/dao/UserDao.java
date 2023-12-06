package com.example.CRUD_SpringBoot.dao;

import com.example.CRUD_SpringBoot.model.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers();

    void addUser(User user);

    void updateUser(User user);

    User getUserId(long id);

    User removeUser(long id);
}
