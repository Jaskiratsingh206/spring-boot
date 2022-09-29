package com.example.EmployeeValidation;


import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ValidationRepository{
    List<Employee> displayAllEmployees();
    void delete(Employee employee);
    void save(Employee employee);

}