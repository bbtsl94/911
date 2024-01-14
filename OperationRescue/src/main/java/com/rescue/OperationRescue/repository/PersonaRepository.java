package com.rescue.OperationRescue.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rescue.OperationRescue.entity.Persona;


public interface PersonaRepository extends JpaRepository<Persona,Long>{
    
}
