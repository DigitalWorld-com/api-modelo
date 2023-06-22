package com.digitalworlds.api.base.services;

import com.digitalworlds.api.base.models.CulturaObject;
import com.digitalworlds.api.base.models.CulturaObjectDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GreetingService implements IGreeting{

    @Override
    public CulturaObjectDTO processApiCall() throws JsonProcessingException {
        RestTemplate client = new RestTemplate();
        CulturaObject response = client.getForObject("https://www.cultura.gob.ar/api/v2.0/", CulturaObject.class);

        CulturaObjectDTO culturaObjectDTO = new CulturaObjectDTO();
        culturaObjectDTO.setMuseos(response.getMuseos());

        return culturaObjectDTO;
    }

}
