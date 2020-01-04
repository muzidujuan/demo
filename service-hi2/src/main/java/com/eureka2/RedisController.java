package com.eureka2;


import com.redis.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
@RequestMapping(value="/redis")
public class RedisController{

    @Autowired
    RedisUtil redisUtil;

    @RequestMapping("set")
    public void  setRedis(){
        System.out.println("redis test start");
        redisUtil.set("2019","这是一条测试数据", 0);
    }

    @RequestMapping("get")
    public void  getRedis(){
        System.out.println(redisUtil.get("2019", 0));
        redisUtil.get("2019", 0);
    }



}
