package com.example.controller;

import com.example.model.User;
import com.example.service.UserService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

@Api("查询用户")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/init")
    public ModelAndView user(ModelAndView mv) {
        mv.setViewName("/user/user");
        return mv;
    }

    @ApiOperation("新增用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userName", value = "用户名", required = true)
    })
    @PostMapping(value="/add")
    //@RequestMapping(value = "add", method = RequestMethod.POST)
    public String addUser(User user){
        return "addUser"+userService.addUser(user);
    }

    @ApiOperation("列出所有用户")
    @GetMapping(value = "/list")
    public List<User> listUser() {
        return userService.getAll();
    }

}
