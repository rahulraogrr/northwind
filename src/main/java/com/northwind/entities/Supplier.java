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
@Table(name = "Suppliers")
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SupplierID", nullable = false)
    private Integer id;

    @Size(max = 40)
    @NotNull
    @Nationalized
    @Column(name = "CompanyName", nullable = false, length = 40)
    private String companyName;

    @Size(max = 30)
    @Nationalized
    @Column(name = "ContactName", length = 30)
    private String contactName;

    @Size(max = 30)
    @Nationalized
    @Column(name = "ContactTitle", length = 30)
    private String contactTitle;

    @Size(max = 60)
    @Nationalized
    @Column(name = "Address", length = 60)
    private String address;

    @Size(max = 15)
    @Nationalized
    @Column(name = "City", length = 15)
    private String city;

    @Size(max = 15)
    @Nationalized
    @Column(name = "Region", length = 15)
    private String region;

    @Size(max = 10)
    @Nationalized
    @Column(name = "PostalCode", length = 10)
    private String postalCode;

    @Size(max = 15)
    @Nationalized
    @Column(name = "Country", length = 15)
    private String country;

    @Size(max = 24)
    @Nationalized
    @Column(name = "Phone", length = 24)
    private String phone;

    @Size(max = 24)
    @Nationalized
    @Column(name = "Fax", length = 24)
    private String fax;

    @Nationalized
    @Lob
    @Column(name = "HomePage")
    private String homePage;

}