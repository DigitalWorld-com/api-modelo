package com.digitalworlds.api.base.services;

import com.digitalworlds.api.base.entities.GreetingDTO;
import com.digitalworlds.api.base.entities.GreetingEntity;
import com.digitalworlds.api.base.models.CulturaObject;
import com.digitalworlds.api.base.models.CulturaObjectDTO;
import com.digitalworlds.api.base.repositories.GreetingRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class GreetingService implements IGreeting {

    public static Long index = 1L;
    private GreetingRepository greetingRepository;
    private ModelMapper modelMapper;

    public GreetingService(final GreetingRepository greetingRepository,
                           final ModelMapper modelMapper) {
        this.greetingRepository = greetingRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public CulturaObjectDTO processApiCall() throws JsonProcessingException {
        RestTemplate client = new RestTemplate();
        CulturaObject response = client.getForObject("https://www.cultura.gob.ar/api/v2.0/", CulturaObject.class);

        CulturaObjectDTO culturaObjectDTO = new CulturaObjectDTO();
        culturaObjectDTO.setMuseos(response.getMuseos());

        return culturaObjectDTO;
    }

    @Override
    public List<GreetingDTO> getAllGreetings() {
        List<GreetingDTO> greetingDtos = new ArrayList<>();
        return modelMapper.map(greetingRepository.findAll(), greetingDtos.getClass());
    }

    public GreetingDTO getById(Long id) {
        GreetingEntity greetingEntity = null;

        if (!greetingRepository.findById(id).isEmpty()) {
            greetingEntity = greetingRepository.findById(id).get();
        }

        return modelMapper.map(greetingEntity, GreetingDTO.class);
    }

    public void createGreeting(String greeting) {
        GreetingEntity greetingEntity = new GreetingEntity();
        greetingEntity.setGreeting(String.format("%s #%d", greeting, index++));

        greetingRepository.save(greetingEntity);
    }

}
