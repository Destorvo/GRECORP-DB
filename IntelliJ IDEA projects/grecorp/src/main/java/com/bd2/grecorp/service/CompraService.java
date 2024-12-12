package com.bd2.grecorp.service;


import com.bd2.grecorp.dto.RegistrarCompraDTO;
import com.bd2.grecorp.entities.Compra;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;

public interface CompraService {

    void registrarCompra(RegistrarCompraDTO registrarCompraDTO);

}
