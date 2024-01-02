package com.example.api_web_ban_hang.dto;

import com.example.api_web_ban_hang.models.entities.Comment;
import java.math.BigDecimal;
import java.util.List;

public class ProductDTO {
    private long id_product;
    private String name_product;
    private int star_review;
    private BigDecimal listed_price;
    private BigDecimal promotional_price;
    private List<ImageDTO> list_image;
    private List<SizeDTO> list_size;
    private List<Comment> list_comment;
    private String brand;
    private String type;

    public long getId_product() {
        return id_product;
    }

    public void setId_product(long id_product) {
        this.id_product = id_product;
    }

    public String getName_product() {
        return name_product;
    }

    public void setName_product(String name_product) {
        this.name_product = name_product;
    }

    public int getStar_review() {
        return star_review;
    }

    public void setStar_review(int star_review) {
        this.star_review = star_review;
    }

    public BigDecimal getListed_price() {
        return listed_price;
    }

    public void setListed_price(BigDecimal listed_price) {
        this.listed_price = listed_price;
    }

    public BigDecimal getPromotional_price() {
        return promotional_price;
    }

    public void setPromotional_price(BigDecimal promotional_price) {
        this.promotional_price = promotional_price;
    }

    public List<ImageDTO> getList_image() {
        return list_image;
    }

    public void setList_image(List<ImageDTO> list_image) {
        this.list_image = list_image;
    }

    public List<SizeDTO> getList_size() {
        return list_size;
    }

    public void setList_size(List<SizeDTO> list_size) {
        this.list_size = list_size;
    }

    public List<Comment> getList_comment() {
        return list_comment;
    }

    public void setList_comment(List<Comment> list_comment) {
        this.list_comment = list_comment;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
