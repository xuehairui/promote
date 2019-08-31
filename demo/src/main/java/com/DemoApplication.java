package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * <Description> <br>
 *
 * @author xue.hairui<br>
 * @version 1.0<br>
 * @CreateDate 2019/8/19 19:20 <br>
 * @since 1.0<br>
 */
@SpringBootApplication
@EnableScheduling
@MapperScan("com.example.dao")
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
