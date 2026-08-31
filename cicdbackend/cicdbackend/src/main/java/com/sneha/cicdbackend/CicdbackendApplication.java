package com.sneha.cicdbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CicdbackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(CicdbackendApplication.class, args);
		System.out.println("Welcome to backend for CICD project");
	}

}
