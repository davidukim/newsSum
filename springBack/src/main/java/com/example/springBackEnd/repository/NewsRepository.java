package com.example.springBackEnd.repository;

import java.util.Optional;

import com.example.springBackEnd.model.Article;

import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<Article, Long>{
    Optional<Article> findById(Long id);
}