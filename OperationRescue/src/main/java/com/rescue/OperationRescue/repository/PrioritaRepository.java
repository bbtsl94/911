package com.rescue.OperationRescue.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rescue.OperationRescue.entity.Priorita;

public interface PrioritaRepository extends JpaRepository<Priorita,Long>
{

    /**
   * Trova la priorità tramite l'id.
   * @param id Id.
   * @return Istanza di {@link Priorita} 
   */
  public Priorita findPrioritaByIdPriorita(Long id);
    
  /**
   * Trova la priorità tramite tipologia di colore.
   * @param tipocolore TipologiaColore
   * @return Istanza di {@link Priorita} 
   */
  public List<Priorita> findPrioritaByTipocolore(String tipocolore);

  /**
   * Trova la priorità tramite tempistiche.
   * @param tempistiche Tempistiche.
   * @return Istanza di {@link Priorita} 
   */
  public List<Priorita> findPrioritaByTempistiche(int tempistiche);
}
