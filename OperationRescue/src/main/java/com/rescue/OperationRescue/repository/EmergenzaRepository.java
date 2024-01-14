package com.rescue.OperationRescue.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rescue.OperationRescue.entity.Emergenza;
import com.rescue.OperationRescue.entity.Stato;

public interface EmergenzaRepository extends JpaRepository<Emergenza,Long>
{

    /**
   * Trova l'emergenza tramite l'id.
   * @param id Id.
   * @return Istanza di {@link Emergenza} 
   */
  public Emergenza findEmergenzaById(Long id);
  
  
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
  public List<Emergenza> findEmergenzaByIDPriorita(Long idPriorita);

  /**
   * Trova tutte le emergenze tramite ID Numero Personale dell'Operatore Telefonico .
   * @param idNumeroPersonale  IdNumeroPersonale.
   * @return Istanza di {@link Emergenza} 
   */
  public List<Emergenza> findEmergenzaById_numero_personale(Long idNumeroPersonale);

/**
   * Trova lo status dell'emergenza tramite ID status .
   * @param idstatus  IdStatus.
   * @return Istanza di {@link Emergenza} 
   */
  public List<Emergenza> findEmergenzaByStatoEmergenza(Stato idstatus);
  
}
