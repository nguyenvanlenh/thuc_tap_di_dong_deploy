package com.example.api_web_ban_hang.dto;

public class SizeDTO {
    private String name_size;
    private long quantity_available;

    public SizeDTO(String nameSize, int quantityAvailable) {
        this.name_size = nameSize;
        this.quantity_available = quantityAvailable;
    }

    public String getName_size() {
        return name_size;
    }

    public void setName_size(String name_size) {
        this.name_size = name_size;
    }

    public long getQuantity_available() {
        return quantity_available;
    }

    public void setQuantity_available(long quantity_available) {
        this.quantity_available = quantity_available;
    }
}
