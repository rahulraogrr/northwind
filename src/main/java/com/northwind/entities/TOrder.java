package com.northwind.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "TOrders")
public class TOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "OrderID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CustomerID")
    private Customer customerID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EmployeeID")
    private Employee employeeID;

    @Column(name = "OrderDate")
    private Instant orderDate;

    @Column(name = "RequiredDate")
    private Instant requiredDate;

    @Column(name = "ShippedDate")
    private Instant shippedDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ShipVia")
    private Shipper shipVia;

    @Column(name = "Freight")
    private BigDecimal freight;

    @Size(max = 40)
    @Nationalized
    @Column(name = "ShipName", length = 40)
    private String shipName;

    @Size(max = 60)
    @Nationalized
    @Column(name = "ShipAddress", length = 60)
    private String shipAddress;

    @Size(max = 15)
    @Nationalized
    @Column(name = "ShipCity", length = 15)
    private String shipCity;

    @Size(max = 15)
    @Nationalized
    @Column(name = "ShipRegion", length = 15)
    private String shipRegion;

    @Size(max = 10)
    @Nationalized
    @Column(name = "ShipPostalCode", length = 10)
    private String shipPostalCode;

    @Size(max = 15)
    @Nationalized
    @Column(name = "ShipCountry", length = 15)
    private String shipCountry;

}