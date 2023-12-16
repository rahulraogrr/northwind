package com.northwind.entities;

import lombok.*;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "Supplier")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Supplier implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    @Column(name = "CompanyName", nullable = false, length = 40)
    private String companyName;

    @Column(name = "ContactName", length = 50)
    private String contactName;

    @Column(name = "ContactTitle", length = 40)
    private String contactTitle;

    @Column(name = "City", length = 40)
    private String city;

    @Column(name = "Country", length = 40)
    private String country;

    @Column(name = "Phone", length = 30)
    private String phone;

    @Column(name = "Fax", length = 30)
    private String fax;
}
