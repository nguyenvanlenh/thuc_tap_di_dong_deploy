package com.example.api_web_ban_hang.models.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_order")
    private Long idOrder;

    @Column(name = "from_name")
    private String fromName;

    @Column(name = "from_phone")
    private String fromPhone;

    @Column(name = "from_address")
    private String fromAddress;

    @Column(name = "from_ward_name")
    private String fromWardName;

    @Column(name = "from_district_name")
    private String fromDistrictName;

    @Column(name = "from_province_name")
    private String fromProvinceName;

    @Column(name = "from_ward_id")
    private String fromWardId;

    @Column(name = "from_district_id")
    private String fromDistrictId;

    @Column(name = "from_province_id")
    private String fromProvinceId;

    @Column(name = "return_name")
    private String returnName;

    @Column(name = "return_phone")
    private String returnPhone;

    @Column(name = "return_address")
    private String returnAddress;

    @Column(name = "return_ward_name")
    private String returnWardName;

    @Column(name = "return_district_name")
    private String returnDistrictName;

    @Column(name = "return_province_name")
    private String returnProvinceName;

    @Column(name = "return_ward_id")
    private String returnWardId;

    @Column(name = "return_district_id")
    private String returnDistrictId;

    @Column(name = "return_province_id")
    private String returnProvinceId;

    @Column(name = "email_customer")
    private String emailCustomer;

    @Column(name = "to_name")
    private String toName;

    @Column(name = "to_phone")
    private String toPhone;

    @Column(name = "to_address")
    private String toAddress;

    @Column(name = "to_ward_name")
    private String toWardName;

    @Column(name = "to_district_name")
    private String toDistrictName;

    @Column(name = "to_province_name")
    private String toProvinceName;

    @Column(name = "to_ward_id")
    private String toWardId;

    @Column(name = "to_district_id")
    private String toDistrictId;

    @Column(name = "to_province_id")
    private String toProvinceId;

    @Column(name = "note")
    private String note;

    @Column(name = "ship_price")
    private BigDecimal shipPrice;

    @Column(name = "order_value")
    private BigDecimal orderValue;

    @Column(name = "total_price")
    private BigDecimal totalPrice;

    @Column(name = "time_order")
    private LocalDateTime timeOrder;

    @Column(name = "time_updated")
    private LocalDateTime timeUpdated;

    @Column(name = "id_status_order")
    private Integer idStatusOrder;

    public Long getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Long idOrder) {
        this.idOrder = idOrder;
    }

    public String getFromName() {
        return fromName;
    }

    public void setFromName(String fromName) {
        this.fromName = fromName;
    }

    public String getFromPhone() {
        return fromPhone;
    }

    public void setFromPhone(String fromPhone) {
        this.fromPhone = fromPhone;
    }

    public String getFromAddress() {
        return fromAddress;
    }

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    public String getFromWardName() {
        return fromWardName;
    }

    public void setFromWardName(String fromWardName) {
        this.fromWardName = fromWardName;
    }

    public String getFromDistrictName() {
        return fromDistrictName;
    }

    public void setFromDistrictName(String fromDistrictName) {
        this.fromDistrictName = fromDistrictName;
    }

    public String getFromProvinceName() {
        return fromProvinceName;
    }

    public void setFromProvinceName(String fromProvinceName) {
        this.fromProvinceName = fromProvinceName;
    }

    public String getFromWardId() {
        return fromWardId;
    }

    public void setFromWardId(String fromWardId) {
        this.fromWardId = fromWardId;
    }

    public String getFromDistrictId() {
        return fromDistrictId;
    }

    public void setFromDistrictId(String fromDistrictId) {
        this.fromDistrictId = fromDistrictId;
    }

    public String getFromProvinceId() {
        return fromProvinceId;
    }

    public void setFromProvinceId(String fromProvinceId) {
        this.fromProvinceId = fromProvinceId;
    }

    public String getReturnName() {
        return returnName;
    }

    public void setReturnName(String returnName) {
        this.returnName = returnName;
    }

    public String getReturnPhone() {
        return returnPhone;
    }

    public void setReturnPhone(String returnPhone) {
        this.returnPhone = returnPhone;
    }

    public String getReturnAddress() {
        return returnAddress;
    }

    public void setReturnAddress(String returnAddress) {
        this.returnAddress = returnAddress;
    }

    public String getReturnWardName() {
        return returnWardName;
    }

    public void setReturnWardName(String returnWardName) {
        this.returnWardName = returnWardName;
    }

    public String getReturnDistrictName() {
        return returnDistrictName;
    }

    public void setReturnDistrictName(String returnDistrictName) {
        this.returnDistrictName = returnDistrictName;
    }

    public String getReturnProvinceName() {
        return returnProvinceName;
    }

    public void setReturnProvinceName(String returnProvinceName) {
        this.returnProvinceName = returnProvinceName;
    }

    public String getReturnWardId() {
        return returnWardId;
    }

    public void setReturnWardId(String returnWardId) {
        this.returnWardId = returnWardId;
    }

    public String getReturnDistrictId() {
        return returnDistrictId;
    }

    public void setReturnDistrictId(String returnDistrictId) {
        this.returnDistrictId = returnDistrictId;
    }

    public String getReturnProvinceId() {
        return returnProvinceId;
    }

    public void setReturnProvinceId(String returnProvinceId) {
        this.returnProvinceId = returnProvinceId;
    }

    public String getEmailCustomer() {
        return emailCustomer;
    }

    public void setEmailCustomer(String emailCustomer) {
        this.emailCustomer = emailCustomer;
    }

    public String getToName() {
        return toName;
    }

    public void setToName(String toName) {
        this.toName = toName;
    }

    public String getToPhone() {
        return toPhone;
    }

    public void setToPhone(String toPhone) {
        this.toPhone = toPhone;
    }

    public String getToAddress() {
        return toAddress;
    }

    public void setToAddress(String toAddress) {
        this.toAddress = toAddress;
    }

    public String getToWardName() {
        return toWardName;
    }

    public void setToWardName(String toWardName) {
        this.toWardName = toWardName;
    }

    public String getToDistrictName() {
        return toDistrictName;
    }

    public void setToDistrictName(String toDistrictName) {
        this.toDistrictName = toDistrictName;
    }

    public String getToProvinceName() {
        return toProvinceName;
    }

    public void setToProvinceName(String toProvinceName) {
        this.toProvinceName = toProvinceName;
    }

    public String getToWardId() {
        return toWardId;
    }

    public void setToWardId(String toWardId) {
        this.toWardId = toWardId;
    }

    public String getToDistrictId() {
        return toDistrictId;
    }

    public void setToDistrictId(String toDistrictId) {
        this.toDistrictId = toDistrictId;
    }

    public String getToProvinceId() {
        return toProvinceId;
    }

    public void setToProvinceId(String toProvinceId) {
        this.toProvinceId = toProvinceId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public BigDecimal getShipPrice() {
        return shipPrice;
    }

    public void setShipPrice(BigDecimal shipPrice) {
        this.shipPrice = shipPrice;
    }

    public BigDecimal getOrderValue() {
        return orderValue;
    }

    public void setOrderValue(BigDecimal orderValue) {
        this.orderValue = orderValue;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public LocalDateTime getTimeOrder() {
        return timeOrder;
    }

    public void setTimeOrder(LocalDateTime timeOrder) {
        this.timeOrder = timeOrder;
    }

    public LocalDateTime getTimeUpdated() {
        return timeUpdated;
    }

    public void setTimeUpdated(LocalDateTime timeUpdated) {
        this.timeUpdated = timeUpdated;
    }

    public Integer getIdStatusOrder() {
        return idStatusOrder;
    }

    public void setIdStatusOrder(Integer idStatusOrder) {
        this.idStatusOrder = idStatusOrder;
    }
}
