package com.rescue.OperationRescue.services;

import org.springframework.stereotype.Service;

import com.rescue.OperationRescue.entity.Emergenza;
import com.rescue.OperationRescue.repository.EmergenzaRepository;

@Service
public class EmergenzaService extends GenericService<Emergenza, EmergenzaRepository , Long>{

    public EmergenzaService(EmergenzaRepository repository) {
        super(repository);
    }

}
