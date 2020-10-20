package com.example.demo.service;

import com.example.demo.model.User;

import java.util.Map;

public interface UserRepository {

    public User save(User user);
    public Map<String, User> findAll();
}
