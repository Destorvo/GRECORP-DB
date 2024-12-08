package com.bd2.grecorp.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "producto")
@Getter
@Setter
@EqualsAndHashCode
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_producto")
    private Integer codProducto;

    @Column(name = "descripcion", columnDefinition = "TEXT")
    private String descripcion;

    @Column
    private Float precio;

    @Column(name = "fecha_fabricado")
    private LocalDate fechaFabricado;

    @OneToMany(mappedBy = "producto")
    private List<Cotizacion> cotizaciones;

    @OneToMany(mappedBy = "producto")
    private List<Fabricar> fabricaciones;

    @OneToOne(mappedBy = "producto", cascade = CascadeType.ALL)
    private VenderProducto venderProducto;



}
