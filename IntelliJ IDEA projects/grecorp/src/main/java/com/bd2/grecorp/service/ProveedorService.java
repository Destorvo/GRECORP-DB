package com.bd2.grecorp.service;

import com.bd2.grecorp.dto.ProveedorOrdCompPendienteDTO;
import com.bd2.grecorp.dto.ProveedorOrdCompRealizadaDTO;

import java.util.List;

public interface ProveedorService {

    List<ProveedorOrdCompPendienteDTO> getAllProveedorOrdenCompraPendientes();

    List<ProveedorOrdCompRealizadaDTO> getAllProveedorOrdenCompraAprobadas();
}
