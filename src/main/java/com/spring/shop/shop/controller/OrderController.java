package com.spring.shop.shop.controller;

import com.spring.shop.shop.domain.CreateCustomer;
import com.spring.shop.shop.domain.CreateOrder;
import com.spring.shop.shop.domain.dto.CustomerDto;
import com.spring.shop.shop.domain.dto.OrderDto;
import com.spring.shop.shop.service.CustomerService;
import com.spring.shop.shop.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RequestMapping("/orders")
@RequiredArgsConstructor
@RestController
public class OrderController {
    private final OrderService orderService;

    @PostMapping("/new")
    public Response<OrderDto> createNewOrder(@RequestParam ){
        HashMap<Integer, Integer> orderMap = new HashMap<>();
        orderMap.put();

        return Response.success(
                orderService.newOrder(
                        CreateOrder.builder()
                                .customerId()
                                .quantityByProduct(orderMap)
                                .build()
                )
        );
    }
}
