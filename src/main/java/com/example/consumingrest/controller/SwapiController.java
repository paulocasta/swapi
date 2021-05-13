package com.example.consumingrest.controller;

import com.example.consumingrest.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SwapiController {

	@Autowired
	private SwapiService swapiService;

	@GetMapping
	public String getCategories() {
		return swapiService.getCategories();
	}

}