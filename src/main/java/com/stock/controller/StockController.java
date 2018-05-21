package com.stock.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockController {

	@GetMapping("/api/test")
	public String exceptionCheck(){
		System.out.println("Checked in");
		throw new RuntimeException("something went wrong");
	}
	
	@GetMapping("/api/main")
	public String mainCheck(){
		System.out.println("Main in");
		return "Main Success";
	}
}
