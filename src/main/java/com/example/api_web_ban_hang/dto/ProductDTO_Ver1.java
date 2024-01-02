package com.example.api_web_ban_hang.dto;

import java.math.BigDecimal;
import java.util.List;

/**
 * Class này <=> chuỗi Json trả về thông tin của product
 * */
public class ProductDTO_Ver1 {
      public long id_product;
      public String name_product;
      public int start_review;
      public BigDecimal listed_price;
      public BigDecimal promotional_price;
      public List<ImageProductDTO_Ver1> list_image;
      public int id_status_product;

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

      public int getStart_review() {
            return start_review;
      }

      public void setStart_review(int start_review) {
            this.start_review = start_review;
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

      public List<ImageProductDTO_Ver1> getList_image() {
            return list_image;
      }

      public void setList_image(List<ImageProductDTO_Ver1> list_image) {
            this.list_image = list_image;
      }

      public int getId_status_product() {
            return id_status_product;
      }

      public void setId_status_product(int id_status_product) {
            this.id_status_product = id_status_product;
      }
}
