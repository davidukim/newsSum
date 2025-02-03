package com.example.springBackEnd.service;

import com.example.springBackEnd.model.User;
import com.example.springBackEnd.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;

public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User getUserById(Long id){
        return userRepository.getReferenceById(id);
    }
}
