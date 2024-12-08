package com.bd2.grecorp.entities;

import jakarta.persistence.*;
import jakarta.persistence.metamodel.IdentifiableType;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "inventario")
@Getter
@Setter
@EqualsAndHashCode
public class Inventario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "num_inventario")
    private Integer numIventario;

    @Column
    private Integer cantidad;

    @Column(name = "fecha_actualizado")
    private LocalDate fechaActualizado;

    @ManyToOne
    @JoinColumn(name = "num_pieza")
    private Pieza pieza;

    @OneToMany(mappedBy = "inventario")
    private List<Fabricar> fabricaciones;

}
