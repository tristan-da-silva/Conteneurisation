package com.example.demo.service;

import com.example.demo.model.User;
import org.springframework.stereotype.Repository;
import com.example.demo.Writter;

import java.util.Map;


@Repository
public class UserRepositoryImpl implements UserRepository {

    private Writter writter = new Writter();

    @Override
    public User save(User user) {
         writter.add_order(user);
         return user ;
    }



    @Override
    public Map<String, User> findAll() {
        return null;
    }
}
