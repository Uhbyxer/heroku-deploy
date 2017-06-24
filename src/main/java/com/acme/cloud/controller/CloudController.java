package com.acme.cloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CloudController {
	@GetMapping("/")
	public String sayHello() {
		return "Hello from Cloud!!!!";
	}
}
