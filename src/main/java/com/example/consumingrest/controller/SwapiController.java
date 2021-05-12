package com.example.consumingrest.controller;

import com.example.consumingrest.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SwapiController {

	@Autowired
	private SwapiService swapiService;

	@RequestMapping(value = "/categories")
	@ResponseBody
	public String getCategories() {
		return swapiService.getCategories();
	}


	@RequestMapping(value = "/people")
	@ResponseBody
	public ResultPeople getPeople() {
		return swapiService.getPeople();
	}

	@RequestMapping(value = "/planets")
	@ResponseBody
	public ResultPlanets getPlanets() {
		return swapiService.getPlanets();
	}

	@RequestMapping(value = "/species")
	@ResponseBody
	public ResultSpecies getSpecies() {
		return swapiService.getSpecies();
	}

	@RequestMapping(value = "/starships")
	@ResponseBody
	public ResultStarships getStarships() {
		return swapiService.getStarships();
	}

	@RequestMapping(value = "/films")
	@ResponseBody
	public ResultFilms getFilms() {
		return swapiService.getFilms();
	}

	@RequestMapping(value = "/vehicles")
	@ResponseBody
	public ResultVehicles getVehicles() {
		return swapiService.getVehicles();
	}
}