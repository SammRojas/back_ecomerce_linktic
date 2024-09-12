package com.microservice.gestion_pedidos.controller;

import com.microservice.gestion_pedidos.entities.Pedido;
import com.microservice.gestion_pedidos.service.IPedidosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pedido")
public class PedidoController {

    @Autowired
    private IPedidosService pedidosService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public  void savePedido(@RequestBody Pedido pedido){
        pedidosService.save(pedido);
    }

    @GetMapping("/all")
    public ResponseEntity<?> findAllPedidos(){
        return ResponseEntity.ok(pedidosService.finAll());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
        return  ResponseEntity.ok(pedidosService.findById(id));
    }

    @GetMapping("/search-by-order/{idPedido}")
    public  ResponseEntity<?> findProductsByIdOrder(@PathVariable Long idPedido){
        return  ResponseEntity.ok(pedidosService.findProductByIdOrder(idPedido));
    }

}
