package com.bd2.grecorp.entities;

import jakarta.persistence.*;

import java.util.List;


@Entity
public class Estado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_estado")
    private Short codEstado;

    @Column(name = "nombre", length = 21)
    private String nombre;

    @Column(name = "descripcion", columnDefinition = "TEXT")
    private String descripcion;

    @OneToMany(mappedBy = "estado")
    private List<Compra> compras;

    @OneToMany(mappedBy = "estado")
    private List<OrdenCompra> ordenCompras;

    @OneToMany(mappedBy = "estado")
    private List<Cotizacion> cotizaciones;

    @OneToMany(mappedBy = "estado")
    private List<Venta> ventas;

}
