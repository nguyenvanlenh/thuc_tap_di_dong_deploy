package com.example.api_web_ban_hang.models.request;

public class CommentRequest {

    private long id_product;
    private long id_user;
    private int star;
    private String content;

    public CommentRequest(long id_product, long id_user, int star, String content) {
        this.id_product = id_product;
        this.id_user = id_user;
        this.star = star;
        this.content = content;
    }

    public long getId_product() {
        return id_product;
    }

    public void setId_product(long id_product) {
        this.id_product = id_product;
    }

    public long getId_user() {
        return id_user;
    }

    public void setId_user(long id_user) {
        this.id_user = id_user;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
