package com.example.ekite.controller;
import com.example.ekite.model.HelloWorldModel;
import com.example.ekite.service.HelloWorldService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    private final HelloWorldService helloWorldService;

    public HelloWorldController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @GetMapping("/hello_world")
    public String home() {
        HelloWorldModel helloWorldModel = helloWorldService.getHelloWorldModel();
        return helloWorldModel.getMessage();
    }

}
