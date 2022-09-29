package com.example.EmployeeValidation;


import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository implements ValidationRepository {

    List<Employee> list = new ArrayList<>();
    @Override
    public List<Employee> displayAllEmployees() {
        return list;
    }

    @Override
    public void delete(Employee employee) {
        list.remove(employee);

    }

    @Override
    public void save(Employee employee) {
        if(!list.contains(employee)){
            list.add(employee);
        }
    }
}

