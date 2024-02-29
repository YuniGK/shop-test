package com.spring.shop.shop.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Getter
@Table(name = "customers")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Customer {
    @Id
    private int customerId;

    @Column
    private String name;

    @Column
    private String address;

    @Column
    private String phneNumber;

    public Customer(String name, String address, String phneNumber) {
        this.name = name;
        this.address = address;
        this.phneNumber = phneNumber;
    }

    public static Customer newCustomer(CreateCustomer customer){
        return new Customer(customer.getName(), customer.getAddress(), customer.getPhneNumber());
    }
}