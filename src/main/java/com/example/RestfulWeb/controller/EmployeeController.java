package com.example.RestfulWeb.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping
    String SayHello(){
        return "Hello";
    }
    @GetMapping("/add")
    String add(){
        return "sum is";
    }

    @GetMapping("/weather")
    String getWeather(){
        return "weather is good";
    }
}

