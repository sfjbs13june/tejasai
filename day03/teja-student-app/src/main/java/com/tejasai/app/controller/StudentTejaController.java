package com.tejasai.app.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentTejaController {
    @GetMapping ("/getstudent")
    public String getstudentdetail(){
        return "student1";
    }
    @PutMapping("/updatestudent")
    public String updatestudentdetail(){
        return "Update student1";
    }
    @DeleteMapping("/deletestudent")
    public String deletestudentdetail(){
        return "delete student1";
    }
}
