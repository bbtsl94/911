package com.rescue.OperationRescue.services;

import org.springframework.stereotype.Service;

import com.rescue.OperationRescue.entity.Operatore_Telefonico;
import com.rescue.OperationRescue.repository.OperatoreTelefonicoRepository;

@Service
public class OperatoreTelefonico  extends GenericService<Operatore_Telefonico, OperatoreTelefonicoRepository , Long>{

    public OperatoreTelefonico(OperatoreTelefonicoRepository repository) {
        super(repository);
    }
    
}
