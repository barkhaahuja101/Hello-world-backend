package com.example.HelloWorld.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

  public String getMessage() {
    System.out.println("This is Java World");
    return "This is Java World";
  }
}