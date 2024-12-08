package com.bd2.grecorp.service;

import com.bd2.grecorp.dto.EstadoOrdCompraDTO;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface OrdCompraService {
    List<EstadoOrdCompraDTO> verEstadoOrdCompra(String estado);

    void registrarOrdCompra(Integer codProveedor, Integer codTrabajador, Integer codPieza, Integer cantidad);
}