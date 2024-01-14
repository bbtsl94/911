package com.rescue.OperationRescue.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rescue.OperationRescue.entity.Vettura;

public interface VetturaRepository  extends JpaRepository<Vettura,Long>{
    
}
