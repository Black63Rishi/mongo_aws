package com.example.MongoConnectAws.controller;


import com.example.MongoConnectAws.model.Users;
import com.example.MongoConnectAws.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class TestController {

    @Autowired
    public UserRepository repository;


    @GetMapping("user")
    public String usertest(){
        return "user api works";
    }

    @GetMapping("dev")
    public String devloptest(){
        return "devloper api works";
    }

    @GetMapping("/admin")
    public List<Users> adminTest(){
        return repository.findAll();
    }

}
