package com.bd2.grecorp.repositories;

import com.bd2.grecorp.entities.Compra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface CompraRespository extends JpaRepository<Compra, Integer> {
    @Procedure(procedureName = "registrar_compra")
    void registrarCompra(@Param("num_ordcompra") Integer numOrdCompra,
                              @Param("cod_mp") Integer codMP,
                              @Param("observaciones") String Observaciones);
}
