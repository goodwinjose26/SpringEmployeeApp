package com.example.employee_backend.dao;

import com.example.employee_backend.model.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeDao extends CrudRepository<Employee,Integer> {
    @Query(value = "SELECT `id`, `cmpname`, `designation`, `empcode`, `mobno`, `name`, `password`, `salary`, `username` FROM `employees` WHERE `empcode`= :empcode",nativeQuery = true)
    List<Employee> searchEmployee(@Param("empcode") Integer empcode);
}
