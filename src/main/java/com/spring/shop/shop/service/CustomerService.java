package com.spring.shop.shop.service;

import com.spring.shop.shop.domain.CreateCustomer;
import com.spring.shop.shop.domain.Customer;
import com.spring.shop.shop.reopsitory.CustomerRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Transactional
    public Customer newCustomer(CreateCustomer customer){
        //dto -> entity
        Customer entity = Customer.newCustomer(customer);
        return customerRepository.save(entity);
    }
}
