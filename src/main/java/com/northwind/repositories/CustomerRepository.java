package com.northwind.repositories;

import com.northwind.entities.Customer;
import com.querydsl.core.types.Predicate;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAllCustomers(Predicate predicate);

    List<Object> orderAnalytics(Predicate predicate);
}
