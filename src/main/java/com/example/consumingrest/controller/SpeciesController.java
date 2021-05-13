package com.example.consumingrest.controller;

import com.example.consumingrest.domain.Species;
import com.example.consumingrest.service.ResultSpecies;
import com.example.consumingrest.service.SwapiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpeciesController {

    private SwapiService swapiService;

    public SpeciesController(SwapiService swapiService) {
        this.swapiService = swapiService;
    }

    @GetMapping("/species")
    public ResultSpecies getSpecies() {
        return swapiService.getSpecies();
    }

    @GetMapping(value = "/species/{id}")
    public Species getVehicleById(@PathVariable("id") String id) {
        return swapiService.getSpecie(id);
    }
}
