package com.example.test;

import com.example.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMongo {

    @Resource
    private MongoTemplate mongoTemplate;

    @Test
    public void test() {
        mongoTemplate.createCollection("test");

    }

    @Test
    public void inset() {
        User user = new User("张三");
        mongoTemplate.insert(user);
    }

}
