package com.nest.employee_backend.controller;


import com.nest.employee_backend.dao.EmployeeDao;
import com.nest.employee_backend.model.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController

public class EmployeeController {

    @Autowired
    EmployeeDao employeeDao;

    @GetMapping("/")
    public String MainPage(){
        return "Welcome to Main page!";
    }


    @CrossOrigin(origins = "*")
    @PostMapping(path = "add", consumes = "application/json", produces = "application/json")
    public Map<String,String> AddEmployee(@RequestBody Employees employees) {

        System.out.println(employees.getName().toString());
        System.out.println(employees.getDesignation().toString());
        System.out.println(employees.getSalary());
        System.out.println(employees.getCompanyName().toString());
        System.out.println(employees.getMobileNumber().toString());
        System.out.println(employees.getUsername().toString());
        System.out.println(employees.getPassword().toString());

        employeeDao.save(employees);
        HashMap<String,String> map=new HashMap<>();
        map.put("status","success");
        return map;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewAll")
    public List<Employees> ViewAllEmployee()
    {
        return (List<Employees>)  employeeDao.findAll();
    }


    @CrossOrigin(origins = "*")
    @PostMapping(path = "/search",produces = "application/json", consumes = "application/json")
    public List<Employees> SearchEmployee(@RequestBody Employees e)
    {
        String empCode= String.valueOf(e.getEmpCode());
        System.out.println(empCode);
        return (List<Employees>) employeeDao.SearchEmployee(e.getEmpCode());
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/delete",produces = "application/json", consumes = "application/json")
    public Map<String, String> DeleteEmployee(@RequestBody Employees e){
        String empid = String.valueOf(e.getId());
        System.out.println(empid);
        employeeDao.DeleteEmployee(e.getId());

        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("status","success");
        return hashMap;

    }


    @PostMapping("edit")
    public String EditEmployee() {
            return "Welcome to Edit employee page!";
    }

}

