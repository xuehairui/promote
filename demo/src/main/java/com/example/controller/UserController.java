package com.example.controller;

import com.example.domain.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user/add", method = RequestMethod.GET)
    @ResponseBody
    public String addUser(){
        User user = new User();
        user.setUserName("张三");
        user.setPassword("11");
        user.setCredits(1);
        user.setLastVisitDate(new Date());
        return "addUser"+userService.addUser(user);
    }

}
