package com.rescue.OperationRescue.services;

import com.rescue.OperationRescue.repository.VetturaServizioRepository;
import com.rescue.OperationRescue.entity.Vettura_Servizio;
public class VetturaServizio extends GenericService<Vettura_Servizio, VetturaServizioRepository, Long>{

    public VetturaServizio(VetturaServizioRepository repository) {
        super(repository);
    }
}
