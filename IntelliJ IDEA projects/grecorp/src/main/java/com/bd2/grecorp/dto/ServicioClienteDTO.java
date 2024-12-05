package com.bd2.grecorp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
public class ServicioClienteDTO {
    private String cliente;
    private String correo;
    private String servicio;
    private Float costo;
    private LocalDate realizado;
    private String trabajador;
    private String observaciones;
}
