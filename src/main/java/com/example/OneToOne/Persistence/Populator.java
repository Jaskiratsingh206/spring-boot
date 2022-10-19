package com.example.OneToOne.Persistence;

import com.example.OneToOne.Domain.Email;
import com.example.OneToOne.Domain.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Repository;

@Repository
public class Populator implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private EmailRepository emailRepository;

    @Override
    public void run(String... args) throws Exception {
       final var emailId1 = emailRepository.save(new Email("jaskiratsingh206@gmail.com"));
       userRepository.save(new Users("Jaskirat Singh",emailId1));
    }
}
