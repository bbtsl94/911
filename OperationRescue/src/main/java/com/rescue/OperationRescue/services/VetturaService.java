package com.rescue.OperationRescue.services;

import com.rescue.OperationRescue.entity.Vettura;
import com.rescue.OperationRescue.repository.VetturaRepository;

public class VetturaService extends GenericService<Vettura, VetturaRepository, Long>{

    public VetturaService(VetturaRepository repository) {
        super(repository);
    }


}
