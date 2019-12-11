package com.demo.circuitbreakerebookstore.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EBookStoreResource {

	@GetMapping(value = "/recommendedBooks")
	public String readList() {
		return "Spring in Action (Manning), Cloud Native Java (O'Reilly), Learning Spring Boot (Packt)";
	}

}
