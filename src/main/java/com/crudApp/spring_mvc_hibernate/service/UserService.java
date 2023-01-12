package com.crudApp.spring_mvc_hibernate.service;

import com.crudApp.spring_mvc_hibernate.entity.User;

import java.util.List;

public interface UserService {
    void add(User user);
    User update(User user);
    void remove(long id);
    User getUser(long id);
    List<User> listUsers();
}
