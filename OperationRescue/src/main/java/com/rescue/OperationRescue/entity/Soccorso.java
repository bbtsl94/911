package com.rescue.OperationRescue.entity;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Soccorso")
public class Soccorso  extends GenericEntity
{
      @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name= "inizio_soccorso")
    private LocalDate inizioSoccorso;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name= "n_emergenza")
    private Emergenza emergenza;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name= "n_vettura")
    private Vettura vettura;


    
}
