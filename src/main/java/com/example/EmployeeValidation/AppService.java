package com.example.EmployeeValidation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AppService {

    List<Employee> listOfEmp = new ArrayList<>();

    //Repository//
    @Autowired
    private ValidationRepository repository;

    @Autowired
    private ValidationService validationService;

    public List<Employee> addingEmployee(Employee employee){
        if(validationService.emailValidation(employee.getEmail()) && validationService.phoneValidation(employee.getPhoneNo())){
            repository.save(employee);
            listOfEmp.add(employee);
        }
        return listOfEmp;
    }



}

