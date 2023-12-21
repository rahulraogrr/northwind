package com.northwind.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;
import org.hibernate.annotations.Nationalized;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class CustomerCustomerDemoId implements Serializable {
    private static final long serialVersionUID = -1895048151058232901L;
    @Size(max = 5)
    @NotNull
    @Nationalized
    @Column(name = "CustomerID", nullable = false, length = 5)
    private String customerID;

    @Size(max = 10)
    @NotNull
    @Nationalized
    @Column(name = "CustomerTypeID", nullable = false, length = 10)
    private String customerTypeID;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        CustomerCustomerDemoId entity = (CustomerCustomerDemoId) o;
        return Objects.equals(this.customerTypeID, entity.customerTypeID) &&
                Objects.equals(this.customerID, entity.customerID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerTypeID, customerID);
    }

}