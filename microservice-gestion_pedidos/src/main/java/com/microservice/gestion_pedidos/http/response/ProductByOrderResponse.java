package com.microservice.gestion_pedidos.http.response;

import com.microservice.gestion_pedidos.dto.ProductoDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductByOrderResponse {

    private Long id_pedido;
    private Date fecha;
    private List<ProductoDTO> productoDTOList;
}
