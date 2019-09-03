package com.example.service.impl;

import com.example.model.User;
import com.example.dao.UserDao;
import com.example.repository.UserRepository;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Resource
    private UserRepository userRepository;

    @Override
    public int addUser(User user) {
        userRepository.save(user);
        return 0;
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }
}
