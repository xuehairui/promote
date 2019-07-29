package com.example.service.impl;

import com.example.model.User;
import com.example.dao.UserDao;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public int addUser(User user) {
        //return userDao.insert(user);
        return 0;
    }

    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }
}
