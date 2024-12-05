package com.bd2.grecorp.service.impl;

import com.bd2.grecorp.dto.ProveedorOrdCompPendienteDTO;
import com.bd2.grecorp.dto.ProveedorOrdCompRealizadaDTO;
import com.bd2.grecorp.repositories.ProveedorRepository;
import com.bd2.grecorp.service.ProveedorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProveedorServiceImpl implements ProveedorService {

    private final ProveedorRepository proveedorRepository;


    public ProveedorServiceImpl(ProveedorRepository proveedorRepository) {
        this.proveedorRepository = proveedorRepository;
    }

    @Override
    public List<ProveedorOrdCompPendienteDTO> getAllProveedorOrdenCompraPendientes() {
        return proveedorRepository.getAllProveedorOrdCompraPendientes();

    }

    @Override
    public List<ProveedorOrdCompRealizadaDTO> getAllProveedorOrdenCompraAprobadas() {
        return proveedorRepository.getAllProveedorOrdCompraAprobadas();
    }
}
