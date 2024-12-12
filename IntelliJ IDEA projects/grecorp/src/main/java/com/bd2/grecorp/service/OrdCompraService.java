package com.bd2.grecorp.service;

import com.bd2.grecorp.dto.EstadoOrdCompraDTO;
import com.bd2.grecorp.dto.RegistrarOrdCompraDTO;

import java.util.List;

public interface OrdCompraService {
    List<EstadoOrdCompraDTO> verEstadoOrdCompra(String estado);

    void registrarOrdCompra(RegistrarOrdCompraDTO registrarOrdCompra);
}
