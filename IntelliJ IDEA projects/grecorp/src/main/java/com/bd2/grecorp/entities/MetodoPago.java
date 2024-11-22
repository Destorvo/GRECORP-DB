package com.bd2.grecorp.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "metodo_pago")
@Getter
@Setter
@EqualsAndHashCode
public class MetodoPago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_mp")
    private Byte codMP;

    @Column(name = "nombre", length = 21)
    private String nombre;

    @Column(name = "descripcion", columnDefinition = "TEXT")
    private String descripcion;

    @OneToMany(mappedBy = "metodoPago")
    private List<Compra> compras;

    @OneToMany(mappedBy = "metodoPago")
    private List<Venta> ventas;

}
