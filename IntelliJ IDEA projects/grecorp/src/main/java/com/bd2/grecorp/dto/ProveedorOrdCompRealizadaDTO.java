package com.bd2.grecorp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class ProveedorOrdCompRealizadaDTO {
    private String nombre;
    private String ruc;
    private Integer numOrden;
    private LocalDateTime fechaEmitida;
    private LocalDateTime fechaAprobada;
    private String estado;
}
