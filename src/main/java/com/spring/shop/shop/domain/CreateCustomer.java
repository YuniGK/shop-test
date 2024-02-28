package com.spring.shop.shop.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.Accessors;

@Getter
@Builder
@Accessors(chain=true)
public class CreateCustomer {
    private final String name;

    private final String address;

    private final String phneNumber;
}
