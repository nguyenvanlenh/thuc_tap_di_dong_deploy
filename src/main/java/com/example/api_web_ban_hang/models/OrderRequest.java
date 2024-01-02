package com.example.api_web_ban_hang.models;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class OrderRequest {
    private String name_customer;
    private String phone;
    private String email_customer;
    private AddressRequest to_address;
    private String note;
    private BigDecimal ship_price;
    private BigDecimal order_value;
    private BigDecimal total_price;
    private Set<OrderDetailRequest> list_order_detail = new HashSet<>();

    public OrderRequest(String name_customer, String phone, String email_customer, AddressRequest to_address, String note, BigDecimal ship_price, BigDecimal order_value, Set<OrderDetailRequest> list_order_detail, BigDecimal total_price) {
        this.name_customer = name_customer;
        this.phone = phone;
        this.email_customer = email_customer;
        this.to_address = to_address;
        this.note = note;
        this.ship_price = ship_price;
        this.order_value = order_value;
        this.total_price = total_price;
        this.list_order_detail = list_order_detail;
    }

    public String getName_customer() {
        return name_customer;
    }

    public void setName_customer(String name_customer) {
        this.name_customer = name_customer;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail_customer() {
        return email_customer;
    }

    public void setEmail_customer(String email_customer) {
        this.email_customer = email_customer;
    }

    public AddressRequest getTo_address() {
        return to_address;
    }

    public void setTo_address(AddressRequest to_address) {
        this.to_address = to_address;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public BigDecimal getShip_price() {
        return ship_price;
    }

    public void setShip_price(BigDecimal ship_price) {
        this.ship_price = ship_price;
    }

    public BigDecimal getOrder_value() {
        return order_value;
    }

    public void setOrder_value(BigDecimal order_value) {
        this.order_value = order_value;
    }

    public BigDecimal getTotal_price() {
        return total_price;
    }

    public void setTotal_price(BigDecimal total_price) {
        this.total_price = total_price;
    }

    public Set<OrderDetailRequest> getList_order_detail() {
        return list_order_detail;
    }

    public void setList_order_detail(Set<OrderDetailRequest> list_order_detail) {
        this.list_order_detail = list_order_detail;
    }
}
