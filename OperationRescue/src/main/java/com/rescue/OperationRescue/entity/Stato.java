package com.rescue.OperationRescue.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name="Stato")
@Entity
public class Stato 
{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name= "aggiornamento")
    private String aggiornamento;

    @JsonIgnore
    @OneToMany(mappedBy="statusOPA")
    private List<Operatore_Attivo> statusOPA;

    @JsonIgnore
    @OneToMany(mappedBy="statusOPT")
    private List<Operatore_Telefonico> statusOPT;

    @JsonIgnore
    @OneToMany(mappedBy="statusVettura")
    private List<Vettura> statusVettura;

    @JsonIgnore
    @OneToMany(mappedBy="statoEmergenza")
    private List<Emergenza> statoEmergenza;

    @JsonIgnore
    @OneToMany(mappedBy="statusPersona")
    private List<Persona> statusPersona;




}
