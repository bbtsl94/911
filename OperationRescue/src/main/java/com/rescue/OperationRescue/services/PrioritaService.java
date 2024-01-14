package com.rescue.OperationRescue.services;

import org.springframework.stereotype.Service;

import com.rescue.OperationRescue.entity.Priorita;
import com.rescue.OperationRescue.repository.PrioritaRepository;

@Service
public class PrioritaService extends GenericService<Priorita, PrioritaRepository , Long>{

    public PrioritaService(PrioritaRepository repository) {
        super(repository);
    }

}
