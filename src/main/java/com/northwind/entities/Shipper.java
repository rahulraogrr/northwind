package com.northwind.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

@Getter
@Setter
@Entity
@Table(name = "Shippers")
public class Shipper {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ShipperID", nullable = false)
    private Integer id;

    @Size(max = 40)
    @NotNull
    @Nationalized
    @Column(name = "CompanyName", nullable = false, length = 40)
    private String companyName;

    @Size(max = 24)
    @Nationalized
    @Column(name = "Phone", length = 24)
    private String phone;

}