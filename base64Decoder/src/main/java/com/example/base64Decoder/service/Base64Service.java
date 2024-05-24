package com.example.base64Decoder.service;

import org.springframework.http.ResponseEntity;

public interface Base64Service {
     ResponseEntity<?> decodeBase64(String base64Data);
}
