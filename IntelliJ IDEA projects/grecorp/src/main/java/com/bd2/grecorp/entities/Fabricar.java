package com.bd2.grecorp.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "fabricar")
@Getter
@Setter
@EqualsAndHashCode
public class Fabricar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_fabricado")
    private Integer codFabricado;

    @Column(name = "fecha_fabricado")
    private LocalDate fechaFabricado;

    @ManyToOne
    @JoinColumn(name = "cod_producto")
    private Producto producto;

    @ManyToOne
    @JoinColumn(name = "num_inventario")
    private Inventario inventario;

    @ManyToOne
    @JoinColumn(name = "cod_trabajador")
    private Trabajador trabajador;


}
