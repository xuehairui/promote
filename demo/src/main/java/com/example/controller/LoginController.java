package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * <Description> <br>
 *
 * @author xue.hairui<br>
 * @version 1.0<br>
 * @CreateDate 2019/7/12 13:45 <br>
 * @since 1.0<br>
 */
@RestController
@RequestMapping("/")
public class LoginController {

    @RequestMapping("login")
    public ModelAndView login(ModelAndView mv) {
        mv.setViewName("/login/login");
        return mv;
    }

}
