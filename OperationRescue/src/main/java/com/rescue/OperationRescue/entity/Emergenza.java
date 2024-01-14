package com.rescue.OperationRescue.entity;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.ToString;

@Data
@Entity
@Table(name="Emergenza")
public class Emergenza  extends GenericEntity
{
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name= "n_emergenza")
    private String nEmergenza;
 
    @Column(name= "tipologia")
    private String tipologia;

    @Column(name= "comune")
    private String comune;

    @Column(name= "numero_civico")
    private int numeroCivico;
    
    @Column(name= "via")
    private String via;

    @Column(name= "stato")
    private boolean stato;

    @Column(name= "n_telefono_utente")
    private String numTelefonoUtente;

    @Column(name= "data_ora_inizio")
    private LocalDate dataOraInizio;
    
    @Column(name= "data_ora_fine")
    private LocalDate dataOraFine;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="id_status")
    private Stato statoEmergenza;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="id_priorita")
    private Priorita id_priorita;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="id_numero_personale")
    private Operatore_Telefonico id_numero_personale ;

    @JsonIgnore
    @OneToMany(mappedBy="emergenza")
    private List<Soccorso> idSoccorso;
}
