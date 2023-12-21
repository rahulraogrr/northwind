package com.northwind.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class TOrderDetailId implements Serializable {
    private static final long serialVersionUID = -3171361506448261828L;
    @NotNull
    @Column(name = "OrderID", nullable = false)
    private Integer orderID;

    @NotNull
    @Column(name = "ProductID", nullable = false)
    private Integer productID;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        TOrderDetailId entity = (TOrderDetailId) o;
        return Objects.equals(this.productID, entity.productID) &&
                Objects.equals(this.orderID, entity.orderID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productID, orderID);
    }

}