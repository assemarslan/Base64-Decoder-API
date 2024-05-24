package com.example.base64Decoder.service.impl;

import com.example.base64Decoder.dto.ErrorResponse;
import com.example.base64Decoder.service.Base64Service;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Base64;

@Service
public class Base64ServiceImpl implements Base64Service {
    @Override
    public ResponseEntity<?> decodeBase64(String base64Data) {
        try {

            byte[] decodedBytes = Base64.getDecoder().decode(base64Data);
            String decodedString = new String(decodedBytes);

            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode rootNode = objectMapper.readTree(decodedString);

            return ResponseEntity.ok().body(rootNode);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(400).body(new ErrorResponse("Invalid base64 data: " + e.getMessage()));
        } catch (JsonProcessingException e) {
            return ResponseEntity.status(400).body(new ErrorResponse("Invalid JSON data: " + e.getMessage()));
        }
    }
}


