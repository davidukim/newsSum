package com.example.springBackEnd.controller;

import com.example.springBackEnd.service.NewsService;
import com.example.springBackEnd.model.NewsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

public class NewsController{

    @Autowired
    private NewsService newsService; 

    @GetMapping("/route/get")
    public ResponseEntity<NewsResponse> fetchNews(){
        NewsResponse response =     
    }
}