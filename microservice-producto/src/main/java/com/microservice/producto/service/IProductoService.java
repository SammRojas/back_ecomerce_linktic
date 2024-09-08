package com.microservice.producto.service;

import com.microservice.producto.entities.Producto;

import java.util.List;

public interface IProductoService {

    List<Producto> findAll();

    Producto findById(Long id);

    void save(Producto producto);

    List<Producto> findByIdPedido(Long idPedido);
}
