package com.northwind.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "Employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EmployeeID", nullable = false)
    private Integer id;

    @Size(max = 20)
    @NotNull
    @Nationalized
    @Column(name = "LastName", nullable = false, length = 20)
    private String lastName;

    @Size(max = 10)
    @NotNull
    @Nationalized
    @Column(name = "FirstName", nullable = false, length = 10)
    private String firstName;

    @Size(max = 30)
    @Nationalized
    @Column(name = "Title", length = 30)
    private String title;

    @Size(max = 25)
    @Nationalized
    @Column(name = "TitleOfCourtesy", length = 25)
    private String titleOfCourtesy;

    @Column(name = "BirthDate")
    private Instant birthDate;

    @Column(name = "HireDate")
    private Instant hireDate;

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
    @Column(name = "HomePhone", length = 24)
    private String homePhone;

    @Size(max = 4)
    @Nationalized
    @Column(name = "Extension", length = 4)
    private String extension;

    @Column(name = "Photo")
    private byte[] photo;

    @Nationalized
    @Lob
    @Column(name = "Notes")
    private String notes;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ReportsTo")
    private Employee reportsTo;

    @Size(max = 255)
    @Nationalized
    @Column(name = "PhotoPath")
    private String photoPath;

}