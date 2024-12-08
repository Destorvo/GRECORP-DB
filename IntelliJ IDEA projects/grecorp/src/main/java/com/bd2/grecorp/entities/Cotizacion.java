package com.bd2.grecorp.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "cotizacion")
@Getter
@Setter
@EqualsAndHashCode
public class Cotizacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "num_cotizacion")
    private Integer numCotizacion;

    @Column
    private Integer cantidad;

    @Column(name = "observaciones", columnDefinition = "TEXT")
    private String observaciones;

    @Column(name = "fecha_realizado")
    private LocalDate fechaRealizado;

    @ManyToOne
    @JoinColumn(name = "cod_producto")
    private Producto producto;

    @ManyToOne
    @JoinColumn(name = "cod_cliente")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "cod_trabajador")
    private Trabajador trabajador;

    @ManyToOne
    @JoinColumn(name = "cod_estado")
    private Estado estado;

}
