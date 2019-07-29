package com.example.controller;

import com.example.model.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("user")
    public ModelAndView user(ModelAndView mv) {
        mv.setViewName("/user/user");
        return mv;
    }

    @RequestMapping(value = "/user/add", method = RequestMethod.POST)
    public String addUser(){
        User user = new User();
        user.setUserName("李四");
        user.setPassword("11");
        user.setCredits(1);
        user.setLastVisitDate(new Date());
        user.setLastIp("127.0.0.1");
        return "addUser"+userService.addUser(user);
    }

    @RequestMapping(value = "/user/list", method = RequestMethod.POST)
    public List<User> listUser() {
        return userService.getAll();
    }

}
