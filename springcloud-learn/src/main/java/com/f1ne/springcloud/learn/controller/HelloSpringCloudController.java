package com.f1ne.springcloud.learn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringCloudController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello world spring cloud!";
    }

}
