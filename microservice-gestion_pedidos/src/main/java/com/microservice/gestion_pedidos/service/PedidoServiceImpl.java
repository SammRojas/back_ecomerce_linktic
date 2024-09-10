package com.microservice.gestion_pedidos.service;

import com.microservice.gestion_pedidos.client.ProductClient;
import com.microservice.gestion_pedidos.dto.ProductoDTO;
import com.microservice.gestion_pedidos.entities.Pedido;
import com.microservice.gestion_pedidos.http.response.ProductByOrderResponse;
import com.microservice.gestion_pedidos.persistence.IPedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoServiceImpl implements IPedidosService{

    @Autowired
    IPedidoRepository pedidoRepository;

    @Autowired
    ProductClient productClient;


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

    @Override
    public ProductByOrderResponse findProductByIdOrder(Long IdPedido) {

        // Consultar pedido
        Pedido pedido = pedidoRepository.findById(IdPedido).orElse(new Pedido());

        //Consultar los productos relacionados al id del pedido
        List<ProductoDTO> productDTOList = productClient.findProductByOrder(IdPedido);

        //Contruir y retornar la respuesta
        return ProductByOrderResponse.builder()
                .id_pedido(pedido.getId())
                .fecha(pedido.getFecha())
                .productoDTOList(productDTOList)
                .build();
    }
}
