package com.rescue.OperationRescue.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rescue.OperationRescue.entity.Operatore_Attivo;

public interface OperatoreAttivoRepository extends JpaRepository<Operatore_Attivo,Long> {
    
}
