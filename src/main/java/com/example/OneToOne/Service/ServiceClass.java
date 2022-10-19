package com.example.OneToOne.Service;

import com.example.OneToOne.Domain.Users;
import com.example.OneToOne.Persistence.EmailRepository;
import com.example.OneToOne.Persistence.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceClass {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private EmailRepository emailRepository;
    public List<Users> getAllUsers(){
        return userRepository.findAll();
    }

    public void addUser(Users user){
        emailRepository.save(user.getEmail());
        userRepository.save(user);
    }
}
