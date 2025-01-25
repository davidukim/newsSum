package com.example.springBackEnd.model;

import java.util.ArrayList;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Article {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String source;
    private String author;
    private String title;
    private String description;
    private String url;
    private String urlToImage;
    private String publishedAt;
    private String content;
}