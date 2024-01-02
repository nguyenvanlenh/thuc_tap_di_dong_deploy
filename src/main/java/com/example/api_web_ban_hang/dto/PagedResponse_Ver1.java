package com.example.api_web_ban_hang.dto;

/**
 * Class này <=> với chuỗi Json trả về dữ liệu (được phân trang)
 * */
public class PagedResponse_Ver1<T> {
    public int current_page;
    public int page_size;
    public int total_pages;
    public int total_items;

    public T data;
    public PagedResponse_Ver1(T data, int current_page, int page_size, int total_items){
        this.current_page = current_page;
        this.page_size = page_size;
        this.total_pages = (int) Math.ceil((double) total_items/page_size);
        this.total_items = total_items;
        this.data = data;
    }

    public int getCurrent_page() {
        return current_page;
    }

    public void setCurrent_page(int current_page) {
        this.current_page = current_page;
    }

    public int getPage_size() {
        return page_size;
    }

    public void setPage_size(int page_size) {
        this.page_size = page_size;
    }

    public int getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(int total_pages) {
        this.total_pages = total_pages;
    }

    public int getTotal_items() {
        return total_items;
    }

    public void setTotal_items(int total_items) {
        this.total_items = total_items;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
