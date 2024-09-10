package com.microservice.gestion_pedidos.service;

import com.microservice.gestion_pedidos.entities.Pedido;
import com.microservice.gestion_pedidos.http.response.ProductByOrderResponse;

import java.util.List;

public interface IPedidosService {

    List<Pedido> finAll();

    Pedido findById(Long id);

    void save(Pedido pedido);

    ProductByOrderResponse findProductByIdOrder(Long IdPedido);
}
