package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class TestController {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @GetMapping("/test")
    public String test(HttpSession session){
        session.setAttribute("222","44444");
        return "测试成功";

    }
}
