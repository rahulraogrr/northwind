package com.northwind.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Table(name = "Product")
@Getter @Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    @Column(name = "ProductName", nullable = false, length = 50)
    private String productName;

    @Column(name = "SupplierId", nullable = false)
    private int supplierId;

    @Column(name = "UnitPrice")
    private Double unitPrice;

    @Column(name = "Package", length = 30)
    private String packageType;

    @Column(name = "IsDiscontinued", nullable = false)
    private boolean discontinued;
}
