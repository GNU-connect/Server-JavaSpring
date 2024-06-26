package com.example.Jinus;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JinusApplication {

	private static final Logger logger = LoggerFactory.getLogger(JinusApplication.class);

	public static void main(String[] args) {
		logger.info("Starting application");
		SpringApplication.run(JinusApplication.class, args);
	}
}
