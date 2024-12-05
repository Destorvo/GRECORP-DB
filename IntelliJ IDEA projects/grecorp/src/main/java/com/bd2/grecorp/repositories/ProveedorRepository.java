package com.bd2.grecorp.repositories;

import com.bd2.grecorp.dto.ProveedorOrdCompPendienteDTO;
import com.bd2.grecorp.dto.ProveedorOrdCompRealizadaDTO;
import com.bd2.grecorp.entities.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProveedorRepository extends JpaRepository<Proveedor, Integer> {

    @Query("SELECT new com.bd2.grecorp.dto.ProveedorOrdCompPendienteDTO( " +
            "p.nombre, p.ruc, o.numOrden, o.fechaEmitida, e.nombre)" +
            "FROM Proveedor p " +
            "JOIN OrdenCompra o ON p.codProveedor = o.proveedor.codProveedor " +
            "JOIN Estado e ON o.estado.codEstado = e.codEstado " +
            "WHERE e.nombre = 'Pendiente' ")
    List<ProveedorOrdCompPendienteDTO> getAllProveedorOrdCompraPendientes();

    @Query("SELECT new com.bd2.grecorp.dto.ProveedorOrdCompRealizadaDTO( " +
            "p.nombre, p.ruc, o.numOrden, o.fechaEmitida, o.fechaAprobada, e.nombre)" +
            "FROM Proveedor p " +
            "JOIN OrdenCompra o ON p.codProveedor = o.proveedor.codProveedor " +
            "JOIN Estado e ON o.estado.codEstado = e.codEstado " +
            "WHERE e.nombre = 'Aprobado' ")
    List<ProveedorOrdCompRealizadaDTO> getAllProveedorOrdCompraAprobadas();
}
