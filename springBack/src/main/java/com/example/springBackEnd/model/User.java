package com.example.springBackEnd.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class User {

  @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long id;
  private String userName;
  private String password;
  @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
  private List<Article> articles = new ArrayList<>();

  protected User() {}

  public User(String userName, String password) {
    this.userName = userName;
    this.password = password;
  }
  
  @Override
  public String toString() {
    return String.format(
        "User[id=%d, userName='%s', password='%s']",
        id, userName, password);
  }

  public Long getId() {
    return id;
  }

  public String getuserName() {
    return userName;
  }

  public String getpassword() {
    return password;
  }
}