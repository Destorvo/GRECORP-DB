package com.bd2.grecorp.repositories;

import com.bd2.grecorp.entities.OrdenCompra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdCompraRepository extends JpaRepository<OrdenCompra, Integer> {

    @Procedure(procedureName = "estado_ordenes_compra")
    List<Object[]> verEstadoOrdCompra(@Param("estado") String estado);

    @Procedure(procedureName = "registrar_orden_compra")
    void registrarOrdenCompra(@Param("p_cod_proveedor") Integer codProveedor,
                              @Param("p_cod_trabajador") Integer codTrabajador,
                              @Param("p_cod_pieza") Integer codPieza,
                              @Param("p_cantidad") Integer cantidad);

}
