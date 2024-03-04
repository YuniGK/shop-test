package com.spring.shop.shop.domain.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class OrderDto {
    private final String name;
    private final String address;
    private final String phoneNumber;
}
