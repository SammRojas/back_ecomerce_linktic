package com.microservice.gestion_pedidos.persistence;

import com.microservice.gestion_pedidos.entities.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IPedidoRepository extends JpaRepository<Pedido, Long> {

}
