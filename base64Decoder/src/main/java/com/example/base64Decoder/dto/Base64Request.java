package com.example.base64Decoder.dto;
import lombok.Data;

@Data
public class Base64Request {
    private String text;

    public String getText(){
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
