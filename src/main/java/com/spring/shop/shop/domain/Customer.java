package com.spring.shop.shop.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Table(name = "customers")
@NoArgsConstructor(AccessLevel.PROTECTED)
@AllArgsConstructor
public class Customer {
    @Id
    private Long customerId;

    @Column
    private String name;

    @Column
    private String address;

    @Column
    private String phneNumber;

    public static Customer newCustomer(String name, String address, String phneNumber){
        return new Customer(name, address, phneNumber);
    }
}