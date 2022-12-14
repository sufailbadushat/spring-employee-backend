package com.nest.employee_backend.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmployeeController {

    @GetMapping("/")
    public String MainPage(){
        return "Welcome to Main page!";
    }

    @PostMapping("add")
    public  String AddEmployee(){ return "Welcome to add employee page!"; }

    @PostMapping("search")
    public String SearchEmployee(){ return "Welcome to Search employee page!"; }

    @GetMapping("viewAll")
    public String ViewAllEmployee(){ return "Welcome to View all employee page!"; }

    @PostMapping("edit")
    public String EditEmployee() {
            return "Welcome to Edit employee page!";
    }

    @PostMapping("delete")
    public String DeleteEmployee(){
        return "Welcome to Delete employee page!";

    }
}

