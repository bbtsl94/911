package com.rescue.OperationRescue.services;

import org.springframework.stereotype.Service;

import com.rescue.OperationRescue.entity.Tipologia_Gestione_Call;
import com.rescue.OperationRescue.repository.TipologiaGestioneCallRepository;

@Service
public class TipologiaGestioneCallService extends GenericService<Tipologia_Gestione_Call, TipologiaGestioneCallRepository , Long>{

    public TipologiaGestioneCallService(TipologiaGestioneCallRepository repository) {
        super(repository);
    }


}
