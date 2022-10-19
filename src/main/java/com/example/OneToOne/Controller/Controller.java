package com.example.OneToOne.Controller;

import com.example.OneToOne.Domain.Users;
import com.example.OneToOne.Service.ServiceClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class Controller {
    @Autowired
    private ServiceClass service;

    @GetMapping
    public List<Users> getAllUsers(){
        return service.getAllUsers();
    }

    @PostMapping
    public void addUser(@RequestBody Users user){

        service.addUser(user);
    }
}
