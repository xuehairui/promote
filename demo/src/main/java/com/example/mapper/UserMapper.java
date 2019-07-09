package com.example.mapper;

import com.example.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    @Select("select * from user")
    List<User> getAll();

    @Insert("insert into user(user_name, credits, password, last_visit_date, last_ip) " +
            "values (#{userName}, #{credits}, #{password}, #{lastVisitDate}, #{lastIp})")
    int insert(User user);
}
