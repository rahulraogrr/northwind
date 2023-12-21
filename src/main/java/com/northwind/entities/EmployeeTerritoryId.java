package com.northwind.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;
import org.hibernate.annotations.Nationalized;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class EmployeeTerritoryId implements Serializable {
    @Serial
    private static final long serialVersionUID = 4939201160070443645L;
    @NotNull
    @Column(name = "EmployeeID", nullable = false)
    private Integer employeeID;

    @Size(max = 20)
    @NotNull
    @Nationalized
    @Column(name = "TerritoryID", nullable = false, length = 20)
    private String territoryID;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        EmployeeTerritoryId entity = (EmployeeTerritoryId) o;
        return Objects.equals(this.territoryID, entity.territoryID) &&
                Objects.equals(this.employeeID, entity.employeeID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(territoryID, employeeID);
    }

}