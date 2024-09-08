package com.microservice.producto.service;

import com.microservice.producto.entities.Producto;
import com.microservice.producto.persistence.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductoServiceImpl implements IProductoService{

    @Autowired
    IProductoRepository productoRepository;

    @Override
    public List<Producto> findAll() {
        return (List<Producto>) productoRepository.findAll();
    }

    @Override
    public Producto findById(Long id) {
        return productoRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Producto producto) {
        productoRepository.save(producto);
    }

    @Override
    public List<Producto> findByIdPedido(Long idPedido) {
        return productoRepository.findAllProductos(idPedido);
    }
}
