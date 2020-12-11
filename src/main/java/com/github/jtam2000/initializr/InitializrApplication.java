package com.github.jtam2000.initializr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InitializrApplication {

	public static void main(String[] args) {
		SpringApplication.run(InitializrApplication.class, args);
		System.out.println("Jason's first Spring Boot Application");
	}

}
