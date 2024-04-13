package com.example.demo.home;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class Home {
    @GetMapping
    public String hello(){
        return "<h1>Welcome to my student API, use /api/v1/student mapping to interact with the API.</h1>";
    }
}
