package com.microservice.gestion_pedidos.service;

import com.microservice.gestion_pedidos.entities.Pedido;
import com.microservice.gestion_pedidos.persistence.IPedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoServiceImpl implements IPedidosService{

    @Autowired
    IPedidoRepository pedidoRepository;

    @Override
    public List<Pedido> finAll() {
        return (List<Pedido>) pedidoRepository.findAll();
    }

    @Override
    public Pedido findById(Long id) {
        return pedidoRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Pedido pedido) {
        pedidoRepository.save(pedido);
    }
}
