package com.spring.shop.shop.controller;

import com.spring.shop.shop.domain.CreateCustomer;
import com.spring.shop.shop.domain.Customer;
import com.spring.shop.shop.service.CustomerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/customers")
@RestController
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/new")
    public Customer createNewCustomer(@RequestParam CreateCustomer customer){
        return customerService.newCustomer(customer);
    }
}
