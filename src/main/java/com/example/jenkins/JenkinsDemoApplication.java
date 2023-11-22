package com.example.jenkins;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class JenkinsDemoApplication {

	public static void main(String[] args) {
		log.debug("Application is running");
		SpringApplication.run(JenkinsDemoApplication.class, args);
		log.debug("Second logger");
	}

}
