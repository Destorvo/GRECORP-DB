package com.bd2.grecorp.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "vender_producto")
@Getter
@Setter
@EqualsAndHashCode
public class VenderProducto  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_vp")
    private Integer codVp;

    private Integer cantidad;

    @ManyToOne
    @JoinColumn(name = "num_venta")
    private Venta venta;

    @OneToOne
    @JoinColumn(name = "cod_producto", nullable = false, unique = true)
    private Producto producto;



}
