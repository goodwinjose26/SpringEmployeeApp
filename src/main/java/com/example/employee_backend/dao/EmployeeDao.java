package com.example.employee_backend.dao;

import com.example.employee_backend.model.Employee;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeDao extends CrudRepository<Employee,Integer> {
    @Query(value = "SELECT `id`, `cmpname`, `designation`, `empcode`, `mobno`, `name`, `password`, `salary`, `username` FROM `employees` WHERE `empcode`= :empcode",nativeQuery = true)
    List<Employee> searchEmployee(@Param("empcode") Integer empcode);
   @Modifying
   @Transactional
    @Query(value = "DELETE FROM `employees` WHERE `id`=:id",nativeQuery = true)
    void deleteEmployee(@Param("id") Integer id);
}
