package com.northwind.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "TOrderDetails")
public class TOrderDetail {
    @EmbeddedId
    private TOrderDetailId id;

    @MapsId("productID")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ProductID", nullable = false)
    private Product productID;

    @NotNull
    @Column(name = "UnitPrice", nullable = false)
    private BigDecimal unitPrice;

    @NotNull
    @Column(name = "Quantity", nullable = false)
    private Short quantity;

    @NotNull
    @Column(name = "Discount", nullable = false)
    private Float discount;

}