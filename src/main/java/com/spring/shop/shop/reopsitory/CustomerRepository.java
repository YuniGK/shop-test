package com.spring.shop.shop.reopsitory;

import com.spring.shop.shop.domain.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
}
