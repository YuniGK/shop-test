package com.spring.shop.shop.domain;

import jakarta.persistence.Column;
import org.springframework.data.annotation.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Table(name = "order_items")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class OrderItem {
    @Id
    private int orderItemId;

    @Column
    private int productId;

    @Column
    private int orderQuantity;

    public OrderItem(int productId, int orderQuantity) {
        this.productId = productId;
        this.orderQuantity = orderQuantity;
    }
}
