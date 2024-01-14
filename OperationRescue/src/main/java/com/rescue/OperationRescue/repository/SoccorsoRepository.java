package com.rescue.OperationRescue.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rescue.OperationRescue.entity.Soccorso;

public interface SoccorsoRepository extends JpaRepository<Soccorso,Long>{
    
}
