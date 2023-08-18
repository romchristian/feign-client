package com.example.feingclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "demo", url = "http://localhost:8081/api",
configuration = FeigClientConfiguration.class)
public interface  DemoClient {
    @GetMapping("/error")
    public ResponseEntity<?> error();
}
