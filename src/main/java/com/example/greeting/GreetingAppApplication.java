package com.example.greeting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GreetingAppApplication {

	public static void main(String[] args) {

		SpringApplication.run(GreetingAppApplication.class, args);

//		http://localhost:8081/swagger-ui/index.html    (url for Swagger)
	}

}