package com.tejasai.app;

import org.springframework.web.bind.annotation.*;

@RestController
public class AppController {
    @GetMapping("/get")
    public String getData(){
        return "get data";
    }
    @PutMapping("/put")
    public String putData() {
        return "put data";
    }
    @PostMapping("/post")
    public String postData() {
        return "post data";
    }
    @DeleteMapping("/Delete")
    public String deleteData() {
        return "delete data";
    }
}
