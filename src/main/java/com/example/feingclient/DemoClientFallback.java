package com.example.feingclient;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;


public class DemoClientFallback implements DemoClient {
    @Override
    public ResponseEntity<?> error() {
        try {
            return ResponseEntity.badRequest().body("Exito");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
