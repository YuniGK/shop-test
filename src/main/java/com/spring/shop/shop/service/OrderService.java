package com.spring.shop.shop.service;

import com.spring.shop.shop.domain.CreateOrder;
import com.spring.shop.shop.domain.Customer;
import com.spring.shop.shop.domain.Order;
import com.spring.shop.shop.domain.dto.CustomerDto;
import com.spring.shop.shop.reopsitory.OrderRepository;
import org.springframework.data.domain.jaxb.SpringDataJaxb;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public OrderDto newOrder(CreateOrder order){
        //dto -> entity
        Order entity = Order.newOrder(order);
        Order saved = orderRepository.save(entity);

        return OrderDto.builder()
                .build();
    }
}
