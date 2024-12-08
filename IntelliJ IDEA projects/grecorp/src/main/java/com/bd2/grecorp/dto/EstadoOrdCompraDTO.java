package com.bd2.grecorp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class EstadoOrdCompraDTO {
    private String nombre;
    private String ruc;
    private Integer numOrden;
    private Date fechaEmitida;
    private Date fechaAprobada;
    private String estado;
}
