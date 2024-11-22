package com.bd2.grecorp.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "trabajador")
@Getter
@Setter
@EqualsAndHashCode
public class Trabajador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_trabajador")
    private Integer codTrabajdor;

    @Column(name = "dni", length = 8)
    private String dni;

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

    @Column(name = "fecha_contratado")
    private LocalDate fechaContratado;

    @ManyToOne
    @JoinColumn(name = "cod_cargo")
    private Cargo cargo;

    @OneToMany(mappedBy = "trabajador", cascade = CascadeType.ALL)
    private List<RealizarServicio> realizarServicios;

    @OneToMany(mappedBy = "trabajador", cascade = CascadeType.ALL)
    private List<Cotizacion> cotizaciones;

    @OneToMany(mappedBy = "trabajador", cascade = CascadeType.ALL)
    private List<OrdenCompra> ordenCompras;

    @OneToMany(mappedBy = "trabajador", cascade = CascadeType.ALL)
    private List<Fabricar> fabricaciones;

}
