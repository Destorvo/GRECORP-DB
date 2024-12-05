package com.bd2.grecorp.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "venta")
@Getter
@Setter
@EqualsAndHashCode
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "num_venta")
    private Integer numVenta;

    @ManyToOne
    @JoinColumn(name = "cod_estado")
    private Estado estado;

    @Column(columnDefinition = "TEXT")
    private String observaciones;

    @Column(name = "fecha_venta")
    private LocalDateTime fechaVenta;

    @ManyToOne
    @JoinColumn(name = "cod_cliente")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "cod_trabajador")
    private Trabajador trabajador;

    @ManyToOne
    @JoinColumn(name = "metodo_pago")
    private MetodoPago metodoPago;

    @OneToMany(mappedBy = "venta")
    private List<VenderProducto> venderProductos;
}
