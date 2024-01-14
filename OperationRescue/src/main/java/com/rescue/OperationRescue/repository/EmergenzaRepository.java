package com.rescue.OperationRescue.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rescue.OperationRescue.entity.Emergenza;

public interface EmergenzaRepository extends JpaRepository<Emergenza,Long>
{
    /**
   * Trova l'emergenza tramite il N.Emergenza.
   * @param emergenza NEmergenza.
   * @return Istanza di {@link Emergenza} 
   */
  public Emergenza findByNEmergenza(String emergenza);
  
  
    /**
   * Trova l'emergenza tramite ID Priorità .
   * @param idPriorità  IDPriorità.
   * @return Istanza di {@link Emergenza} 
   */
  public Emergenza findEmergenzaByIDPriorita(Long idPriorita);

  /**
   * Trova l'emergenza tramite ID Numero Personale dell'Operatore Telefonico .
   * @param idNumeroPersonale  IdNumeroPersonale.
   * @return Istanza di {@link Emergenza} 
   */
  public Emergenza findEmergenzaById_numero_personale(Long idNumeroPersonale);

}
