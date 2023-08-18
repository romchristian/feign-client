package com.example.feingclient;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableFeignClients
@SpringBootApplication
public class FeingClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeingClientApplication.class, args);
	}


	@RequiredArgsConstructor
	@RestController
	@RequestMapping("/api")
	class ErrorDemo {
		private final DemoClient demoClient;

		@GetMapping("/error")
		public ResponseEntity<?> error() {
				return ResponseEntity.ok(demoClient.error());
		}
	}
}
