package com.example.api_web_ban_hang.models;

import java.math.BigDecimal;

public class OrderDetailRequest {
    private Long id_product;

    private String nameSize;

    private BigDecimal price;

    private Integer quantity;

    public OrderDetailRequest(Long id_product, String nameSize, BigDecimal price, Integer quantity) {
        this.id_product = id_product;
        this.nameSize = nameSize;
        this.price = price;
        this.quantity = quantity;
    }

    public Long getId_product() {
        return id_product;
    }

    public void setId_product(Long id_product) {
        this.id_product = id_product;
    }

    public String getNameSize() {
        return nameSize;
    }

    public void setNameSize(String nameSize) {
        this.nameSize = nameSize;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
