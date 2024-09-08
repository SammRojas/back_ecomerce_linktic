package com.microservice.producto.persistence;

import com.microservice.producto.entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {

    List<Producto> findOllByPedidoId(Long pedidoId);

    @Query("SELECT p FROM productos p = WHERE p.pedidoId = :pedidoId")
    List<Producto> findAllProductos(Long pedidoId);

}
