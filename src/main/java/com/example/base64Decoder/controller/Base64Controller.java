package com.example.base64Decoder.controller;

import com.example.base64Decoder.dto.Base64Request;
import com.example.base64Decoder.dto.ErrorResponse;
import com.example.base64Decoder.service.Base64Service;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class Base64Controller {

    private final Base64Service base64Service;

    @PostMapping("/decode")

    public ResponseEntity<?> decodeBase64(@RequestBody Base64Request base64Request) {
        if (base64Request == null || base64Request.getText() == null) {
            return ResponseEntity.status(400)
                    .body(new ErrorResponse("No base64 data provided"));
        }
        return base64Service.decodeBase64(base64Request.getText());
    }

}



