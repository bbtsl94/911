package com.rescue.OperationRescue.services;

import org.springframework.stereotype.Service;

import com.rescue.OperationRescue.entity.Soccorso;
import com.rescue.OperationRescue.repository.SoccorsoRepository;

@Service
public class SoccorsoService extends GenericService<Soccorso, SoccorsoRepository , Long>{

    public SoccorsoService(SoccorsoRepository repository) {
        super(repository);
    }

}
