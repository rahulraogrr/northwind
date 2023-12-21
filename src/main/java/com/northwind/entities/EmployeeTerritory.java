package com.northwind.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "EmployeeTerritories")
public class EmployeeTerritory {
    @EmbeddedId
    private EmployeeTerritoryId id;

    @MapsId("employeeID")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "EmployeeID", nullable = false)
    private Employee employeeID;

}