package com.digitalworlds.api.base.services;

import com.digitalworlds.api.base.models.CulturaObjectDTO;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface IGreeting {

    CulturaObjectDTO processApiCall() throws JsonProcessingException;

}
