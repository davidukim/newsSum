package com.example.springBackEnd.controller;

import com.example.springBackEnd.service.NewsService;
import com.example.springBackEnd.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@CrossOrigin(origins = "http://localhost:3000")

public class NewsController{

    @Autowired
    private NewsService newsService; 

    @GetMapping("/route/get")
    public String fetchNews(){
        System.out.println("server side");
        return "Hi";
    }
}