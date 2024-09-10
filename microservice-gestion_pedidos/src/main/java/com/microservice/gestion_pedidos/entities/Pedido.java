package com.microservice.gestion_pedidos.entities;

import com.microservice.producto.entities.Producto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Builder
@Table(name = "tbl_pedidos")
@AllArgsConstructor
@NoArgsConstructor
public class Pedido {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "fecha")
        private Date fecha;

}
