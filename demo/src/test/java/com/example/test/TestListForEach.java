package com.example.test;

import com.example.model.User;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class TestListForEach {

    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        list.add(new User("1"));
        list.add(new User("2"));
        list.add(null);
        list.forEach(x -> {
            if(!StringUtils.isEmpty(x.getUserName())) {
                System.out.println(x.getUserName());
            }
        });
    }
}
