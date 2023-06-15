package com.digitalworlds.api.base.services;

import com.digitalworlds.api.base.models.CulturaObject;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface IGreeting {

    CulturaObject processApiCall() throws JsonProcessingException;

}
