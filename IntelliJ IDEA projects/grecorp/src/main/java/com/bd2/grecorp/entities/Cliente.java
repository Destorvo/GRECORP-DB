package com.bd2.grecorp.entities;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "pieza")
@Getter
@Setter
@EqualsAndHashCode
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_cliente")
    private Integer codCliente;

    @Column(name = "nombre", length = 51)
    private String nombre;

    @Column(name = "apellido_paterno", length = 15)
    private String apellidoP;

    @Column(name = "apellido_materno", length = 15)
    private String apellidoM;

    @Email
    @Column
    private String correo;

    @Column(name = "telefono", length = 9)
    private String telefono;

    @Column(name = "ruc_dni", length = 11)
    private String rucDni;

    @Column(name = "direccion", columnDefinition = "TEXT")
    private String direccion;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<RealizarServicio> servicios;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Cotizacion> cotizaciones;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Venta> ventas;

}
