package com.nest.employee_backend.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmployeeController {

    @GetMapping("/")
    public String MainPage(){
        return "Welcome to Main page!";
    }

    @GetMapping("add")
    public  String AddEmployee(){
        return "Welcome to add employee page!";
    }

    @GetMapping("search")
    public String SearchEmployee(){
        return "Welcome to Search employee page!";
    }
}
