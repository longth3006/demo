package com.longth.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/demo")
    public String helloWorld(){
        return "Hello Spring boot";
    }
}
