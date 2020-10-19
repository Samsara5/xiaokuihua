package com.service;

import com.pojo.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void addUser(User u);
    List<User> findUserById(int id);
    void updateUser(User u);
    boolean findUserByusername(String username,String password);
}
