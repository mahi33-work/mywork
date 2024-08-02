package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {
	@GetMapping("/test")
	public String getMapping() {
		return "welcome to the first application";
		
	}

}
