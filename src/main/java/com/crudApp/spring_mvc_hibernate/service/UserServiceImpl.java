package com.crudApp.spring_mvc_hibernate.service;

import com.crudApp.spring_mvc_hibernate.dao.UserDAO;
import com.crudApp.spring_mvc_hibernate.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private final UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public void add(User user) {
        userDAO.add(user);
    }

    @Override
    public User update(User user) {
        return userDAO.update(user);
    }

    @Override
    public void remove(long id) {
        userDAO.remove(id);
    }

    public User getUser(long id) {
        return userDAO.getUser(id);
    }

    @Override
    public List<User> listUsers() {
        return userDAO.listUsers();
    }
}
