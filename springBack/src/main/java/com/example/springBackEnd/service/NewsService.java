package com.example.springBackEnd.service;

import com.example.springBackEnd.model.Article;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewsService {
    @Autowired
    private Article response;

    public Article fetchNews(){

        return response;
    }
}
