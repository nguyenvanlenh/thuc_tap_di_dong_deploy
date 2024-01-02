package com.example.api_web_ban_hang.mapper;

import com.example.api_web_ban_hang.dto.ImageDTO;
import com.example.api_web_ban_hang.dto.ProductDTO;
import com.example.api_web_ban_hang.dto.SizeDTO;
import com.example.api_web_ban_hang.models.entities.Comment;
import com.example.api_web_ban_hang.models.entities.ImageProduct;
import com.example.api_web_ban_hang.models.entities.Product;
import com.example.api_web_ban_hang.models.entities.SizeProduct;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;


public class MapperProduct {
    public static ProductDTO mapperProductToDTO(Product product){
        ProductDTO build = new ProductDTO();
        build.setId_product(product.getId());
        build.setName_product(product.getNameProduct());
        build.setStar_review(product.getStarReview());
        build.setListed_price(product.getListedPrice());
        build.setPromotional_price(product.getPromotionalPrice());
        build.setBrand(product.getBrand().getNameBrand());
        build.setType(product.getTypeProduct().getNameType());
        build.setList_image(mapperImageToDTO(product.getImageProducts()));
        build.setList_size(mappperSizeToDTO(product.getListSizes()));
        build.setList_comment(new ArrayList<>(product.getComments()));
        return build;
    }
    public static List<ImageDTO> mapperImageToDTO(Set<ImageProduct> list_image){

        return list_image.stream().map(img->{
            return new ImageDTO(img.getId(), img.getPath());
        }).collect(Collectors.toList());

    }
    public static List<SizeDTO> mappperSizeToDTO(Set<SizeProduct> list_size){

        return list_size.stream().map(size->{
            return new SizeDTO(size.getSize().getNameSize(), size.getQuantityAvailable());
        }).collect(Collectors.toList());
    }


}
