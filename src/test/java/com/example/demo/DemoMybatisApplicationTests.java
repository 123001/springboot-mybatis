package com.example.demo;

import com.example.demo.mapper.UserMapper;
import com.example.demo.vo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.sql.DataSource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoMybatisApplicationTests {

    @Resource
    DataSource dataSource;

    @Autowired
    UserMapper userMapper;

    @Autowired
    ApplicationContext applicationContext;

    @Test
    public void contextLoads() {
        User user = userMapper.getUser(1897601);
        System.out.println("=========="+user.getUsername());
    }



}
