package com.taller.tallerspringboot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@AllArgsConstructor
@Getter
@Setter
public class Counter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCounter;

    @Column
    private String nombre;

    @Column
    private Float porcentajeVictoria;

    @Column
    private Float porcentajeDerrota;

    @ManyToOne
    @JoinColumn(name = "nacionalidad_id_nacionalidad", nullable = false)
    private Nacionalidad nacionalidad;

}
