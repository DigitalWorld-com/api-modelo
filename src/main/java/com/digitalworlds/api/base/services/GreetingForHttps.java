package com.digitalworlds.api.base.services;

import com.digitalworlds.api.base.entities.GreetingDTO;
import com.digitalworlds.api.base.models.CulturaObjectDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.modelmapper.ModelMapper;

import java.util.List;

public class GreetingForHttps implements IGreeting {

    private ModelMapper modelMapper;

    public GreetingForHttps(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }
    @Override
    public CulturaObjectDTO processApiCall() throws JsonProcessingException {
        // este tiene seguridad

        // validacion auth0 bla bla bla

        return null;
    }

    @Override
    public List<GreetingDTO> getAllGreetings() {
        return null;
    }
}
