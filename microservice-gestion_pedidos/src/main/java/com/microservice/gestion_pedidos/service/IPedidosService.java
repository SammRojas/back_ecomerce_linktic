package com.microservice.gestion_pedidos.service;

import com.microservice.gestion_pedidos.entities.Pedido;

import java.util.List;

public interface IPedidosService {

    List<Pedido> finAll();

    Pedido findById(Long id);

    void save(Pedido pedido);
}
