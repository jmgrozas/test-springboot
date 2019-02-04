package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TestConstroller {

	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	public String createOrder() {
		return "hola";
	}

}
