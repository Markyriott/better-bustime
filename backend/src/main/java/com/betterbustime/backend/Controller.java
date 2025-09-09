package com.betterbustime.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    RedisTemplate<String, Object> redisTemplate;

    @GetMapping("/bus")
    public String bus(){
        System.out.println(redisTemplate.hasKey("test"));
        return "Bus";
    }
}
