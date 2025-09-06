package com.betterbustime.backend.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BusController {

    @GetMapping("/bus")
    public String busInfo(){
        System.out.println("Bus Connection");
        return "bus information...";
    }
}
