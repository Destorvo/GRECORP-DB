package com.bd2.grecorp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class ServicioClienteDTO {
    private String cliente;
    private String correo;
    private String servicio;
    private Float costo;
    private Date realizado;
    private String trabajador;
    private String observaciones;
}
