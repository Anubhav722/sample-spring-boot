package com.example.helloanubhav.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/")
    String helloWorld() {
        return "Hello World!";
    }

}
