package com.bd2.grecorp.service;

import com.bd2.grecorp.dto.CotizacionPendienteFabricacionDTO;
import com.bd2.grecorp.entities.Cotizacion;
import com.bd2.grecorp.entities.Servicio;

import java.util.List;

public interface CotizacionService {
    List<CotizacionPendienteFabricacionDTO> verCotizacionesPendientesFabricacion();
}
