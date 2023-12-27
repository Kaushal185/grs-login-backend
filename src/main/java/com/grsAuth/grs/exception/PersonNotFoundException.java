package com.grsAuth.grs.exception;
import lombok.Data;

@Data
public class PersonNotFoundException extends RuntimeException{
    private String errorCode;
    public PersonNotFoundException(String message,String errorCode){
        super(message);
        this.errorCode = errorCode;
    }
}

