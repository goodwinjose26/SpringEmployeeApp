package com.example.employee_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping("/")
    public String welcome()
    {
        return "WELCOME EMPLOYEE";
    }

    @GetMapping("/view")
    public String view()
    {
        return "VIEW EMPLOYEE DETAILS";
    }
}
