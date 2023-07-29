package com.electronics.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.electronics.service.LaptopService;

@RestController
public class LaptopController {
	@Autowired
	LaptopService ls;
	@GetMapping("/name")
	public String get() {
		return "sfjn";
	}
}
