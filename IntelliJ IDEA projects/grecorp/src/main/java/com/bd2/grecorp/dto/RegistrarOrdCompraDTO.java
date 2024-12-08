package com.bd2.grecorp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class RegistrarOrdCompraDTO {
    private Integer codProveedor;
    private Integer codTrabajador;
    private Integer codPieza;
    private Integer cantidad;
}
