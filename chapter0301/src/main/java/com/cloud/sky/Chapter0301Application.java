package com.cloud.sky;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Chapter0301Application {
	
	@RequestMapping("/")
	String home() {
		 return "欢迎使用Spring Boot!";
	}

	public static void main(String[] args) {
		SpringApplication.run(Chapter0301Application.class, args);
	}

}
