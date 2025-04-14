package com.aws.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WelcomeController {
	private static final Logger LOGGER = LoggerFactory.getLogger(WelcomeController.class);
	
	@GetMapping("/welcome")
	public ResponseEntity<String> welcome() {
		LOGGER.info("Welcome Controller called!");
		return ResponseEntity
				.ok("Welcome to the AWS Demo application! Your application has been deployed successfully...");
	}
}
