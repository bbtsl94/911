package com.example.demo.entity;

import java.time.LocalDate;

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
@Table(name="Vettura_Servizio")
public class Vettura_Servizio 
{
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;


    @Column(name= "data_ora_inizio_servizio")
    private LocalDate dataOraInizio;
    
    @Column(name= "data_ora_fine_servizio")
    private LocalDate dataOraFine;

    @ManyToOne
    @JoinColumn(name= "n_personale")
    private Operatore_Attivo numeroPersonale;
 
    @ManyToOne
    @JoinColumn(name= "n_vettura")
    private Vettura numeroVettura;
    
}
