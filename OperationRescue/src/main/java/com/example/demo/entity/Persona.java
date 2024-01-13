package com.example.demo.entity;

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
@Table( name="Persona")
@Entity
public class Persona 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name= "Codice_fiscale")
    private String codicefiscale;
 
    @Column(name= "nome")
    private String nome;

    @Column(name= "cognome")
    private String cognome;

    @Column(name= "dob")
    private LocalDate dob;

    @Column(name= "residenza")
    private String residenza;

    @Column(name= "telefono")
    private String telefono;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="id_status")
    private Stato statusPersona ;
    
}
