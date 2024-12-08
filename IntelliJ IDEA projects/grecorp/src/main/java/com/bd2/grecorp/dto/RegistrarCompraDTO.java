package com.bd2.grecorp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class RegistrarCompraDTO {
    private Integer numOrdCompra;
    private Integer codMP;
    private String observaciones;
}