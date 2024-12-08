package com.bd2.grecorp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class InventarioDTO {
    private Integer numPieza;
    private String descripcion;
    private Integer cantidad;
    private String proveedor;
    private Date fechaActualizado;

}
