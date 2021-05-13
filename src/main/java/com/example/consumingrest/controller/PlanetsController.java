package com.example.consumingrest.controller;

import com.example.consumingrest.domain.Planet;
import com.example.consumingrest.service.ResultPlanets;
import com.example.consumingrest.service.SwapiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlanetsController {
    private SwapiService swapiService;

    public PlanetsController(SwapiService swapiService) {
        this.swapiService = swapiService;
    }

    @GetMapping(value = "/planets")
    public ResultPlanets getPlanets() {
        return swapiService.getPlanets();
    }

    @GetMapping(value = "/planet/{id}")
    public Planet getVehicleById(@PathVariable("id") String id) {
        return swapiService.getPlanet(id);
    }
}
