package com.jeffcffcp.springboot.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HelloGKEController {

	@GetMapping("/hello")
	public String Hello () {
		
		return "Hello GKE SpringBoot (Jeffcf)";
	}
}
