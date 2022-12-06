package com.nest.employee_backend.controller;


import com.nest.employee_backend.model.Employees;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmployeeController {

    @GetMapping("/")
    public String MainPage(){
        return "Welcome to Main page!";
    }

    @PostMapping(path = "add", consumes = "application/json", produces = "application/json")
    public  String AddEmployee(@RequestBody Employees employees) {

        System.out.println(employees.getName().toString());
        System.out.println(employees.getDesignation().toString());
        System.out.println(employees.getSalary());
        System.out.println(employees.getCompanyName().toString());
        System.out.println(employees.getMobileNumber().toString());
        System.out.println(employees.getUsername().toString());
        System.out.println(employees.getPassword().toString());
        return "Employee added successfully!";
    }

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

