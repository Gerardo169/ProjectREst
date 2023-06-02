package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PruebaRest {
	
	
	@GetMapping(value = "/getPrueba") 
	public String getPrueba() {
		return "pruebaConsumoSoap";
	}
	

}
