package com.eureka2;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceHi2Controller {

    @Value("${server.port}")
    String port;

    @RequestMapping("hi2")
    public String SayHelloHi2(){
        return "hi2:" + port;
    }
}
