package com.example.demoproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TokenizationController {

	@Autowired
	SingleTokenization singleTokenization;
	
	@GetMapping("/get")
	public void get() {
		singleTokenization.get();
	}
}
