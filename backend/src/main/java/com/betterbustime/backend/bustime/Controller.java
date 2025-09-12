package com.betterbustime.backend.bustime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @PostMapping
    public void save(@RequestBody SiriResponse body) {
        System.out.println(body
                .Siri()
                .ServiceDelivery()
                .VehicleMonitoringDelivery()
                .getFirst()
                .VehicleActivity()
                .get(2)
                .MonitoredVehicleJourney()
                .Bearing()
        );
    }

    @GetMapping("/bus")
    public String bus(){
        System.out.println(redisTemplate.hasKey("test"));
        return "Bus";
    }
}
