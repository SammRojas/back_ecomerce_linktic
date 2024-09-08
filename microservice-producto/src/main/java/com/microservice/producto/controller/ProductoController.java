package com.microservice.producto.controller;


import com.microservice.producto.entities.Producto;
import com.microservice.producto.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/producto")
public class ProductoController {

    @Autowired
    private IProductoService productoService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void  saveProduct(@RequestBody Producto producto){
        productoService.save(producto);
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
        return  ResponseEntity.ok(productoService.findById(id));
    }


    @GetMapping("/all")
    public ResponseEntity<?> findAllProductos(){
        return ResponseEntity.ok(productoService.findAll());
    }

}


