package com.example.api_web_ban_hang.models;


import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

public class AuthRequest {
    @NotNull
    @Length(min = 5, max = 50)
    private String username;
    @NotNull
    @Length(min = 5, max = 10)
    private String password;

    public AuthRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}