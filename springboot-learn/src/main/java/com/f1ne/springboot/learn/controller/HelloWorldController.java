package com.f1ne.springboot.learn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("helloworld")
public class HelloWorldController {

    @RequestMapping("hello")
    public String hello(){
        return "hello world spring boot!";
    } 
}
