package com.bd2.grecorp.service;


import com.bd2.grecorp.dto.ActualizarInventarioDTO;
import com.bd2.grecorp.dto.InventarioDTO;

import java.time.LocalDate;
import java.util.List;

public interface InventarioService {
    List<InventarioDTO> verInventario();
    void actualizarInventario(ActualizarInventarioDTO ActualizarInventarioDTO);
}
