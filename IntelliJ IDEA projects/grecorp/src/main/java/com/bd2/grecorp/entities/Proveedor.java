package com.bd2.grecorp.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "proveedor")
@Getter
@Setter
@EqualsAndHashCode
public class Proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_proveedor")
    private Integer codProveedor;

    @Column(name = "nombre", length = 50)
    private String nombre;

    @Column(length = 9)
    private String telefono;

    @Email
    @Column
    private String correo;

    @Column(columnDefinition = "TEXT")
    private String direccion;

    @Column(length = 11)
    private String ruc;

    @OneToMany(mappedBy = "proveedor")
    private List<Pieza> piezas;

    @OneToMany(mappedBy = "proveedor")
    private List<OrdenCompra> ordenCompras;
}
