package com.northwind.services;

import com.northwind.entities.Customer;
import com.querydsl.core.types.Predicate;

import java.util.List;

public interface CustomerService {
    List<Customer> findAllCustomersByPredicate(Predicate predicate);
    List<Object> customerOrders(Predicate predicate);
}
