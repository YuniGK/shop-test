package com.spring.shop.shop.domain;


import jakarta.persistence.Column;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Getter
@Table(name = "store_products")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class StoreProduct {
    @Id
    private String storeProductId;

    @Column
    private String storeId;

    @Column
    private String productId;

    @Column
    private String stockQuantity;
}
