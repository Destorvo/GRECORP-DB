package com.bd2.grecorp.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "compra")
@Getter
@Setter
@EqualsAndHashCode
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "num_compra")
    private Integer numCompra;

    @Column(name = "observaciones", columnDefinition = "TEXT")
    private String observaciones;

    @ManyToOne
    @JoinColumn(name = "cod_estado")
    private Estado estado;

    @Column(name = "fecha_realizado")
    private LocalDate fechaRealizado;

    @ManyToOne
    @JoinColumn(name = "cod_mp")
    private MetodoPago metodoPago;

    @OneToOne
    @JoinColumn(name = "num_orden_compra", nullable = false, unique = true)
    private OrdenCompra ordenCompra;

}
