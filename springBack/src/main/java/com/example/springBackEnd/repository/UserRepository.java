package com.example.springBackEnd.repository;

import java.util.Optional;

import com.example.springBackEnd.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
    Optional<User> findById(Long id);
}

