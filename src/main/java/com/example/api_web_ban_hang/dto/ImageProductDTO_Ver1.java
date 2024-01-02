package com.example.api_web_ban_hang.dto;


public class ImageProductDTO_Ver1 {
    public long id_image;
    public String path_image;
    public ImageProductDTO_Ver1(long id_image, String path) {
        this.id_image = id_image;
        this.path_image = path;
    }

    public long getId_image() {
        return id_image;
    }

    public void setId_image(long id_image) {
        this.id_image = id_image;
    }

    public String getPath_image() {
        return path_image;
    }

    public void setPath_image(String path_image) {
        this.path_image = path_image;
    }
}
