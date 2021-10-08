package com.pizzahut.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test/")
@CrossOrigin(origins = "*", allowedHeaders = "*", exposedHeaders = "*")
public class TestController {
	
	@GetMapping("test1")
	public String test() {
		return "Test succesful";
	}

}
