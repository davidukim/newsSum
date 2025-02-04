package com.example.springBackEnd.controller;

import java.util.List;

import com.example.springBackEnd.model.Article; // IS ARTICLE AS DEPENDENCY NECESSARY?
import com.example.springBackEnd.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@CrossOrigin(origins = "http://localhost:3000")

public class NewsController{

    @Autowired
    private NewsService newsService; 

    @GetMapping("/route/get")
    public List<Article> fetchNews(){
        return newsService.fetchNews();
    }
}