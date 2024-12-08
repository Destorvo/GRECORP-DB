package com.bd2.grecorp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class CotizacionClienteDTO {
    private String cliente;
    private String correo;
    private String producto;
    private Integer cantidad;
    private String trabajador;
    private Date fechaRealizada;
    private String estado;
}
