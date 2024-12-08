package com.bd2.grecorp.service.impl;

import com.bd2.grecorp.repositories.CompraRespository;
import com.bd2.grecorp.service.CompraService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;

@Service
@Transactional
public class CompraServiceImpl implements CompraService {

    private final CompraRespository compraRepository;

    public CompraServiceImpl(CompraRespository compraRepository) {
        this.compraRepository = compraRepository;
    }

    @Override
    public void registrarCompra(Integer numOrdCompra, Integer codMP, String Observaciones) {
        compraRepository.registrarCompra(numOrdCompra, codMP, Observaciones);
    }
}
