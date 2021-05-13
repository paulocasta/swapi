package com.example.consumingrest.controller;

import com.example.consumingrest.domain.Starship;
import com.example.consumingrest.service.ResultStarships;
import com.example.consumingrest.service.SwapiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StarshipsController {
    private SwapiService swapiService;

    public StarshipsController(SwapiService swapiService) {
        this.swapiService = swapiService;
    }

    @GetMapping(value = "/starships")
    public ResultStarships getStarships() {
        return swapiService.getStarships();
    }

    @GetMapping(value = "/starship/{id}")
    public Starship getStarshipById(@PathVariable("id") String id) {
        return swapiService.getStarship(id);
    }
}
