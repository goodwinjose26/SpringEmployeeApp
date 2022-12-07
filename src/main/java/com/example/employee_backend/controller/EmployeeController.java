package com.example.employee_backend.controller;

import com.example.employee_backend.dao.EmployeeDao;
import com.example.employee_backend.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeDao dao;

@CrossOrigin(origins = "*")
    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
public Map<String,String> add(@RequestBody Employee e)
{
    dao.save(e);
    HashMap<String,String> map = new HashMap<>();
    map.put("status","success");
    return map;
}



    @CrossOrigin(origins = "*")

    @GetMapping("/view")
    public List<Employee> view()
    {
        return  (List<Employee>) dao.findAll();
    }


}
