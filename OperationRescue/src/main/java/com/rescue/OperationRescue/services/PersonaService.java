package com.rescue.OperationRescue.services;

import org.springframework.stereotype.Service;

import com.rescue.OperationRescue.entity.Persona;
import com.rescue.OperationRescue.repository.PersonaRepository;

@Service
public class PersonaService extends GenericService<Persona, PersonaRepository , Long>{

    public PersonaService(PersonaRepository repository) {
            super(repository);
        }
}
