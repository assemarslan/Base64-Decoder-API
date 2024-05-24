package com.example.base64Decoder.dto;

import lombok.Data;

@Data
public class ErrorResponse {
    private String error;

    public ErrorResponse(String error){
        this.error = error;
    }

    public String getError(){
        return error;
    }
}
