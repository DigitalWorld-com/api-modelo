package com.digitalworlds.api.base.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting() {
        return "Hello world!";
    }

    @PostMapping("/greeting")
    public void postGreeting() {
        System.out.println("abc");
        // ...
    }

}
