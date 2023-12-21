package com.northwind.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class CustomerCustomerDemo {
    @EmbeddedId
    private CustomerCustomerDemoId id;

    //TODO [JPA Buddy] generate columns from DB
}