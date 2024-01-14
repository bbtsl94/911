package com.example.demo.entity;
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

@Entity
@Data
@Table(name="Vetture")
public class Vettura 
{
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name= "n_vettura")
    private Long numerovettura;
 
    @Column(name= "targa")
    private String targa;

    @Column(name= "modello")
    private String modello;

    @Column(name= "marca")
    private String marca;

    @Column(name= "n_posti")
    private int numeroposti;

    @Column(name= "tipo_vettura")
    private String tipovettura;

    @Column(name= "sede_caserma")
    private String sedecaserma;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="id_status")
    private Stato statusVettura ;

    @JsonIgnore
    @OneToMany(mappedBy = "vettura")
    private List<Soccorso> nSoccorso;

    @JsonIgnore
    @OneToMany(mappedBy="numeroVettura")
    private List<Vettura_Servizio> numeroVettura;

    
}
