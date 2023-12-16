package com.northwind.services.impl;

import com.northwind.entities.Customer;
import com.northwind.repositories.CustomerRepository;
import com.northwind.services.CustomerService;
import com.querydsl.core.types.Predicate;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;

    @Override
    public List<Customer> findAllCustomersByPredicate(Predicate predicate) {
        return customerRepository.findAllCustomers(predicate);
    }

    @Override
    public List<Object> customerOrders(Predicate predicate) {
        return customerRepository.orderAnalytics(predicate);
    }
}
