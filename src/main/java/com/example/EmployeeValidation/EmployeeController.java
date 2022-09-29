package com.example.EmployeeValidation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/")

public class EmployeeController {
    @Autowired
    private AppService appService;
    //    @GetMapping("/")
//    public Employee calculateGratuity(@Valid final Employee employee) {
//            return employee;
//
//    }
    @PostMapping("/display")
    public List<Employee> displayEmployees(@Valid @RequestBody final Employee employee){
        return appService.addingEmployee(employee);
    }
}
