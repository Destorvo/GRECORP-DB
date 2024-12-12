package com.bd2.grecorp.service.impl;

import com.bd2.grecorp.dto.RegistrarCompraDTO;
import com.bd2.grecorp.repositories.CompraRespository;
import com.bd2.grecorp.service.CompraService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class CompraServiceImpl implements CompraService {

    private final CompraRespository compraRepository;

    public CompraServiceImpl(CompraRespository compraRepository) {
        this.compraRepository = compraRepository;
    }

    @Override
    public void registrarCompra(RegistrarCompraDTO registrarCompraDTO) {
        compraRepository.registrarCompra(
                registrarCompraDTO.getNumOrdCompra(),
                registrarCompraDTO.getCodMP(),
                registrarCompraDTO.getObservaciones()
        );
    }
}
