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
public class Campeon {
    
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCampeon;

    @Column
    private String tipoAtaque;

    @Column
    private Integer vidaBase;

    @Column
    private Boolean manaBool;

    @Column
    private Boolean energiaBool;

    @Column
    private Float velocidadAtaqueBase;

    @Column
    private Float velocidadMovimientoBase;

    @Column
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "nacionalidad_id_nacionalidad", nullable = false)
    private Nacionalidad nacionalidad;

    @ManyToOne
    @JoinColumn(name = "especie_id_especie", nullable = false)
    private Especie especie;

    @ManyToOne
    @JoinColumn(name = "counter_id_counter", nullable = false)
    private Counter counter;

    @ManyToOne
    @JoinColumn(name = "rival_id_rival", nullable = false)
    private Rival rival;



}
