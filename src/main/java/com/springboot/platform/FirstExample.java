package com.springboot.platform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController  
@EnableAutoConfiguration  
public class FirstExample {  
  
    @RequestMapping("/")  
    String home() {  
        return "Hello World！世界你好！O(∩_∩)O哈哈~！！！";  
    }  
  
    public static void main(String[] args) {  



        SpringApplication.run(FirstExample.class, args);  
    }  
}  