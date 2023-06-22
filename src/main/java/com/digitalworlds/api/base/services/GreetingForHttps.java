package com.digitalworlds.api.base.services;

import com.digitalworlds.api.base.models.CulturaObjectDTO;
import com.fasterxml.jackson.core.JsonProcessingException;

public class GreetingForHttps implements IGreeting {
    @Override
    public CulturaObjectDTO processApiCall() throws JsonProcessingException {
        // este tiene seguridad

        // validacion auth0 bla bla bla

        return null;
    }
}
