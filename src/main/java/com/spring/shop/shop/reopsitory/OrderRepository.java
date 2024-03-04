package com.spring.shop.shop.reopsitory;

import com.spring.shop.shop.domain.Customer;
import com.spring.shop.shop.domain.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Integer> {
}
