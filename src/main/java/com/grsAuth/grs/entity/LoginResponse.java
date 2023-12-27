package com.grsAuth.grs.entity;

import lombok.*;

public class LoginResponse {
    private boolean success;
    private String message;

    public LoginResponse(boolean b, String authenticationSuccessful) {
        this.success = b;
        this.message = authenticationSuccessful;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    // Constructors, getters, setters, etc.
}



