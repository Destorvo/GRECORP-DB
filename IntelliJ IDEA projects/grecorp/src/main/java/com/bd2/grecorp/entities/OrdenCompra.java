package com.bd2.grecorp.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "orden_compra")
@Getter
@Setter
@EqualsAndHashCode
public class OrdenCompra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "num_orden")
    private Long numOrden;

    @Column
    private Integer cantidad;

    @Column(name = "observaciones", columnDefinition = "TEXT")
    private String observaciones;

    @Column(name = "fecha_emitida")
    private LocalDateTime fechaEmitida;

    @Column(name = "fecha_aprobada")
    private LocalDateTime fechaAprobada;

    @ManyToOne
    @JoinColumn(name = "cod_proveedor")
    private Proveedor proveedor;

    @ManyToOne
    @JoinColumn(name = "num_pieza")
    private Pieza pieza;

    @ManyToOne
    @JoinColumn(name = "cod_trabajador")
    private Trabajador trabajador;

    @ManyToOne
    @JoinColumn(name = "cod_estado")
    private Estado estado;

    @OneToOne(mappedBy = "ordenCompra", cascade = CascadeType.ALL)
    private Compra compra;

}