package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/")
public class Example {

    @RequestMapping("hello")
    ModelAndView home(ModelAndView mv) {
        mv.setViewName("/hello");
        mv.addObject("name", "欢迎使用thymeleaf");
        return mv;
    }
}
