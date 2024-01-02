package com.example.api_web_ban_hang.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseObject {
    private String status;
    private String message;
    @JsonProperty("data")
    private Object object;

    public ResponseObject(String status, String message, Object object) {
        this.status = status;
        this.message = message;
        this.object = object;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}