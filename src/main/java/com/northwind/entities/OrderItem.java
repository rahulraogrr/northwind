package com.northwind.entities;


import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Table(name = "OrderItem")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderItem implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    @Column(name = "OrderId", nullable = false)
    private int orderId;

    @Column(name = "ProductId", nullable = false)
    private int productId;

    @Column(name = "UnitPrice", nullable = false)
    private double unitPrice;

    @Column(name = "Quantity", nullable = false)
    private int quantity;
}
