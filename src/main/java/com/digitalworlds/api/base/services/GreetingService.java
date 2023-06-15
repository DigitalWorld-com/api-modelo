package com.digitalworlds.api.base.services;

import com.digitalworlds.api.base.models.CulturaObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GreetingService implements IGreeting{

    @Override
    public CulturaObject processApiCall() throws JsonProcessingException {
        RestTemplate client = new RestTemplate();
        CulturaObject response = client.getForObject("https://www.cultura.gob.ar/api/v2.0/", CulturaObject.class);


        CulturaObject culturaObject = new CulturaObject();
        culturaObject.setMuseos(response.getMuseos());

        return culturaObject;
    }

}
