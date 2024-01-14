package com.rescue.OperationRescue.services;

import org.springframework.stereotype.Service;

import com.rescue.OperationRescue.entity.Stato;
import com.rescue.OperationRescue.repository.StatoRepository;

@Service
public class StatoService extends GenericService<Stato, StatoRepository , Long>{

    public StatoService(StatoRepository repository) {
        super(repository);
    }

}
