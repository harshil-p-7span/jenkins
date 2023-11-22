package com.example.jenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsDemoApplication {

	public static final Logger logger = LoggerFactory.getLogger(JenkinsDemoApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(JenkinsDemoApplication.class, args);
		logger.info("Application is running");
	}

}
