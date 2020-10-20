package com.example.demo.controller;


import com.example.demo.model.User;
import com.example.demo.service.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

// Deuxième partie du développement

@RestController
@CrossOrigin
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/order")
    public Map<String, User> listUsers() {
        return userRepository.findAll();
    }

    @PostMapping("/add/order")
    public void addUser(@RequestBody User user) {
        userRepository.save(user);
    }
}
