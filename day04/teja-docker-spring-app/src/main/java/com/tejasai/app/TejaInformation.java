package com.tejasai.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TejaInformation {

    @GetMapping("/name")
    public String name(){
        return "Teja sai mahesh";
    }
    @GetMapping("/age")
    public int age(){
        return 27;
    }
    @GetMapping("/addr")
    public String address(){
        return "kondapur,Hyderabad,500084";
    }
}
