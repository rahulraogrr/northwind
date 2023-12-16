package com.northwind.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "Orders")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Order implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;

    @Column(name = "orderdate", nullable = false)
    private Date orderDate;

    @Column(name = "Ordernumber")
    private String orderNumber;

    @Column(name = "Customerid", nullable = false)
    private int customerId;

    @Column(name = "Totalamount")
    private BigDecimal totalAmount;
}