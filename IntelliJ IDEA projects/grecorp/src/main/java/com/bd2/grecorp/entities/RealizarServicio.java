package com.bd2.grecorp.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "realizar_servicio")
@Getter
@Setter
@EqualsAndHashCode
public class RealizarServicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_rs")
    private Integer codRS;

    private Float costo;

    @Column(name = "fecha_realizado")
    private LocalDate fechaRealizado;


    @ManyToOne
    @JoinColumn(name = "cod_cliente", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "cod_servicio", nullable = false)
    private Servicio servicio;

    @ManyToOne
    @JoinColumn(name = "cod_trabajador", nullable = false)
    private Trabajador trabajador;


}
