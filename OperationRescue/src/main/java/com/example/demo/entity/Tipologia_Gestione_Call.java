package com.example.demo.entity;

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

@Entity
@Data
@Table(name="Tipologia_Gestione_Call")
public class Tipologia_Gestione_Call 
{
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name= "Tipologia")
    private int tipologia;

     @JsonIgnore
    @OneToMany(mappedBy="id_Tipologia_Call")
    private List<Operatore_Attivo> idOperatoreAttivo;

    @JsonIgnore
    @OneToMany(mappedBy="id_Tipologia_Call")
    private List<Operatore_Telefonico> idOperatoreTelefonico;
 
}
