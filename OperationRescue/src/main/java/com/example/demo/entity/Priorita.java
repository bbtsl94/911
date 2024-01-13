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
@Table(name= "Priorita")
public class Priorita 
{
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name= "tipologia_colore")
    private String tipocolore;
 
    @Column(name= "descrizione_emergenza" , length = 2000)
    private String descrizioneEmergenza;

    @Column(name= "tempistiche")
    private int tempistiche;

    @JsonIgnore
    @OneToMany(mappedBy = "id_priorita")
    private List<Emergenza> id_priorita;
  
    
}
