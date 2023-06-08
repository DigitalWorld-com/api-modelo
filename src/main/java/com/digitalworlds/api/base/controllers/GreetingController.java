package com.digitalworlds.api.base.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting() {
        return "Hello world!";
    }

    @GetMapping("/data")
    public String getExternalData() {
        RestTemplate client = new RestTemplate();
        String response = client.getForObject("https://www.cultura.gob.ar/api/v2.0/", String.class);

        return response;
    }

    @PostMapping("/greeting")
    public void postGreeting() {
        System.out.println("abc");
        // ...
    }

}
