package com.grsAuth.grs.entity;

import jakarta.persistence.Entity;
import lombok.*;


public class LoginRequest {
    private String id;
    private String password;

    public LoginRequest(String id, String password) {
        this.id = id;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // getters and setters
}
