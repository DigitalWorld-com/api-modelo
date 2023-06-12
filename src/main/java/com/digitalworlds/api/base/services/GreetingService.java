package com.digitalworlds.api.base.services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GreetingService implements IGreeting{

    @Override
    public String processApiCall() {
        RestTemplate client = new RestTemplate();
        String response = client.getForObject("https://www.cultura.gob.ar/api/v2.0/", String.class);

        return response;
    }

}
