package com.example.springBackEnd.service;

import com.example.springBackEnd.model.NewsResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewsService {
    @Autowired
    private NewsResponse response;

    public NewsResponse fetchNews(){

        return response;
    }
}
