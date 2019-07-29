package com.example.dao;

import com.DemoApplication;
import com.example.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class UserMapperTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void testQuery() {
        List<User> userList = userDao.getAll();
        System.out.println(userList.toString());
  }

}
