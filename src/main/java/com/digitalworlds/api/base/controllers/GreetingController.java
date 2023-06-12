package com.digitalworlds.api.base.controllers;

import com.digitalworlds.api.base.services.GreetingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GreetingController {

    GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/greeting")
    public String greeting() {
        return "Hello world!";
    }

    @GetMapping("/data")
    public String getExternalData() {
        return greetingService.processApiCall();
    }

    @PostMapping("/greeting")
    public void postGreeting() {
        System.out.println("abc");
        // ...
    }

}
