package com.digitalworlds.api.base.services;

import com.digitalworlds.api.base.models.CulturaObjectDTO;
import com.fasterxml.jackson.core.JsonProcessingException;

public class GreetingForHttp implements IGreeting {
    @Override
    public CulturaObjectDTO processApiCall() throws JsonProcessingException {
        // llamadas sin seguridad GET

        return null;
    }
}
