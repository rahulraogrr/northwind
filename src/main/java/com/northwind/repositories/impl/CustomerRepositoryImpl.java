package com.northwind.repositories.impl;

import com.northwind.entities.Customer;
import com.northwind.repositories.CustomerRepository;
import com.querydsl.core.types.Predicate;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.northwind.entities.QCustomer.customer;
import static com.northwind.entities.QOrder.order;

@Repository
@RequiredArgsConstructor
public class CustomerRepositoryImpl implements CustomerRepository {
    private final JPAQueryFactory jpaQueryFactory;

    @Override
    public List<Customer> findAllCustomers(Predicate predicate) {
        return jpaQueryFactory
                .selectFrom(customer)
                .where(predicate)
                .fetch();
    }

    @Override
    public List<Object> orderAnalytics(Predicate predicate) {
        return (List<Object>) jpaQueryFactory
                .from(customer)
                .innerJoin(order)
                .on(customer.id.eq(order.customerId))
                .where(predicate);
    }



}
