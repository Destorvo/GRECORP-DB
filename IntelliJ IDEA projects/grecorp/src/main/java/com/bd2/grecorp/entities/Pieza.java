package com.bd2.grecorp.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "pieza")
@Getter
@Setter
@EqualsAndHashCode
public class Pieza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "num_pieza")
    private Integer numPieza;

    @Column(name = "descripcion", columnDefinition = "TEXT")
    private String descripcion;

    @Column
    private Float precio;

    @ManyToOne
    @JoinColumn(name = "cod_proveedor")
    private Proveedor proveedor;

    @OneToMany(mappedBy = "pieza")
    private List<OrdenCompra> ordenCompras;

    @OneToMany(mappedBy = "pieza")
    private List<Inventario> invetario;



}
