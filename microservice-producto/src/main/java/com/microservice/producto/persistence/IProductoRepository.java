package com.microservice.producto.persistence;

import com.microservice.producto.entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductoRepository extends JpaRepository<Producto, Long> {

    List<Producto> findAllByPedidoId(Long pedidoId);

    @Query("SELECT p FROM tbl_productos p = WHERE p.pedido_Id = :pedidoId")
    List<Producto> findAllProductos(Long pedidoId);

}
