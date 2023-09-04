package com.tejasai.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;


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
