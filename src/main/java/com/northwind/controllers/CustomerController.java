package com.northwind.controllers;

import com.northwind.entities.Customer;
import com.northwind.services.CustomerService;
import com.querydsl.core.types.Predicate;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.northwind.entities.QCustomer.customer;

@RestController
@RequestMapping("/api/v1/customers")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Customer>> getAllAddress(@RequestParam(value = "id", required = false) Integer id){
        Predicate predicate = customer.id.eq(id);
        return ResponseEntity.ok(customerService.findAllCustomersByPredicate(predicate));
    }

}
