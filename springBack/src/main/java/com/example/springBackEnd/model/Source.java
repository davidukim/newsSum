package com.example.springBackEnd.model;

public class Source {
    private String id;
    private String name;

    public String getId(){
        return this.id;
    }
    public void setId(String id) { this.id = id; }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
}
