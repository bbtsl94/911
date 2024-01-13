package com.example.demo.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Operatori_Attivi")
public class Operatore_Attivo
{

    @Column(name= "numero_personale")
    private String numeroPersonale;
 
    @Column(name= "ruolo")
    private String ruolo;

    @Column(name= "sede_lavoro")
    private String sedeLavoro;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name= "id_tipologia_call")
    private Tipologia_Gestione_Call id_Tipologia_Call;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="id_status")
    private Stato statusOPA;
    
    @JsonIgnore
    @OneToMany(mappedBy = "numeroPersonale")
    private List<Vettura_Servizio> idVetturaServizio;
       
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @OneToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    @JoinColumn(name = "id")
    private Persona idPersona;
}
