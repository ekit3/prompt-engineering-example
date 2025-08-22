package com.example.ekite.service;

import com.example.ekite.model.HelloWorldModel;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    public HelloWorldModel getHelloWorldModel() {
        return HelloWorldModel.builder()
                .message("Hello World! Your Spring Boot application is running.")
                .build();
    }
}
