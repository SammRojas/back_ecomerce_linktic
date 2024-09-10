package com.microservice.gestion_pedidos.client;

import com.microservice.gestion_pedidos.dto.ProductoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "msvc-producto", url = "localhost:8090/api/producto")
public interface ProductClient {


    @GetMapping("search-by-product/{idProduct}")
    List<ProductoDTO> findProductByOrder(@PathVariable Long idProduct);
}
