package com.bd2.grecorp.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "servicio")
@Getter
@Setter
@EqualsAndHashCode
public class Servicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "TINYINT", name = "cod_servicio")
    private Byte codServicio;

    @Column(name = "descripcion", columnDefinition = "TEXT")
    private String descripcion;

    @OneToMany(mappedBy = "servicio", cascade = CascadeType.ALL)
    private List<RealizarServicio> sercicios;


}
