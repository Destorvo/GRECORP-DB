package com.bd2.grecorp.repositories;

import com.bd2.grecorp.dto.InventarioDTO;
import com.bd2.grecorp.entities.Inventario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InventarioRepository extends JpaRepository<Inventario, Integer> {

    @Procedure(procedureName = "ver_inventario")
    List<Object[]> verInventario();

    @Procedure(procedureName = "actualizar_inventario")
    void actualizarInventario(@Param("p_num_pieza") Integer numPieza,
                              @Param("cantidad") Integer cantidad);
}
