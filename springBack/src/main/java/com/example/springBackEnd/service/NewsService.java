package com.example.springBackEnd.service;

import java.util.List;

import com.example.springBackEnd.model.Article;
import com.example.springBackEnd.model.NewsApiResponse;
import com.example.springBackEnd.repository.NewsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NewsService {
    @Autowired
    private NewsRepository newsRepository;
    private final String NEWS_URL = "https://newsapi.org/v2/top-headlines?country=us&apiKey=f0413017cc0c45e69113bddad4383d57";
    private final RestTemplate restTemplate = new RestTemplate();

    @Scheduled(fixedRate = 1500000) // fetch every 5min
    public List<Article> fetchNews(){

        try{
            NewsApiResponse response = restTemplate.getForObject(NEWS_URL, NewsApiResponse.class);
            if (response != null && response.getArticles() != null){
                return response.getArticles();
            }
        } catch(Exception e){
            System.err.println("Error fetching news: " + e.getMessage());
        }
        return null;
    }
}
