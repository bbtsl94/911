package com.rescue.OperationRescue.services;

import org.springframework.stereotype.Service;

import com.rescue.OperationRescue.entity.Operatore_Attivo;
import com.rescue.OperationRescue.repository.OperatoreAttivoRepository;

@Service
public class OperatoreAttivoService extends GenericService<Operatore_Attivo, OperatoreAttivoRepository , Long>{

    public OperatoreAttivoService(OperatoreAttivoRepository repository) {
        super(repository);
    }

}
