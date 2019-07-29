package com.example.dao;

import com.example.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/** 
 * <Description> <br> 
 *  
 * @author xue.hairui<br>
 * @version 1.0<br>
 * @CreateDate 2019\7\26 0026 19:38 <br>
 * @since 1.0<br>
 */
@Repository
public interface UserDao {

    //@Select("select * from user")
    List<User> getAll();

    /*@Insert("insert into user(user_name, credits, password, last_visit_date, last_ip) " +
            "values (#{userName}, #{credits}, #{password}, #{lastVisitDate}, #{lastIp})")*/
    //int insert(User user);
}
