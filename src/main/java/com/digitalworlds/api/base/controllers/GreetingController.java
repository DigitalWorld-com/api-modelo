package com.digitalworlds.api.base.controllers;

import com.digitalworlds.api.base.models.CulturaObject;
import com.digitalworlds.api.base.models.CulturaObjectDTO;
import com.digitalworlds.api.base.services.GreetingService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GreetingController {

    GreetingService greetingService;

    public GreetingController(final GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/greeting")
    public String greeting() {
        return "Hello world!";
    }

    @GetMapping("/data")
    public ResponseEntity<CulturaObjectDTO> getExternalData() throws JsonProcessingException {
        return ResponseEntity.ok(greetingService.processApiCall());
    }

    @PostMapping("/greeting")
    public void postGreeting() {
        System.out.println("abc");
        // ...
    }

}
