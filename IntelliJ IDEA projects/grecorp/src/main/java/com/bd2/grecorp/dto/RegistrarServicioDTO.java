package com.bd2.grecorp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
public class RegistrarServicioDTO {
    private String dniRuc;
    private Integer codTrabajador;
    private Integer codServicio;
    private Float costo;
    private LocalDate fechaRealizado;
    private String observaciones;
}
