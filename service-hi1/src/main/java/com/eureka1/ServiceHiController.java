package com.eureka1;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceHiController {


    @RequestMapping("hi1")
    public String SayHelloHi1(){
        return "hi1";
    }
}
