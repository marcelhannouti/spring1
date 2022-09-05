package com.example.demo;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class spring1 {
private static final Logger LOGGER =(Logger) LoggerFactory.getLogger(Logger1.class);
	public static void main(String[] args) {
		SpringApplication.run(Logger1.class, args);
		LOGGER.info("info");
		LOGGER.warn("warn");
		LOGGER.debug("error");
		LOGGER.debug("debug");
		LOGGER.trace("trace");

	}

}