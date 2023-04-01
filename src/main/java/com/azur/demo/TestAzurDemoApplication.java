package com.azur.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
public class TestAzurDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestAzurDemoApplication.class, args);
	}

	@RequestMapping("/message")
	public String getMessage()
	{
		return "Welcome to Spring Boot Azur ";
	}

}
