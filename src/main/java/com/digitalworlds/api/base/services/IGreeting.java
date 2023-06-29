package com.digitalworlds.api.base.services;

import com.digitalworlds.api.base.entities.GreetingDTO;
import com.digitalworlds.api.base.models.CulturaObjectDTO;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.List;

public interface IGreeting {

    CulturaObjectDTO processApiCall() throws JsonProcessingException;

    List<GreetingDTO> getAllGreetings();

}
