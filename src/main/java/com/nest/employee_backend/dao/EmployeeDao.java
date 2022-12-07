package com.nest.employee_backend.dao;

import com.nest.employee_backend.model.Employees;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeDao extends CrudRepository<Employees,Integer> {

    @Query(value =  "SELECT `id`, `company_name`, `designation`, `mobile_number`, `name`, `password`, `salary`, `username`, `emp_code` FROM `employees` WHERE `emp_code`= :empCode", nativeQuery = true)
    List<Employees> SearchEmployee(@Param("empCode") Integer empCode);
}
