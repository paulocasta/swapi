package com.example.consumingrest.controller;

import com.example.consumingrest.service.ResultStarships;
import com.example.consumingrest.service.SwapiService;
import org.springframework.web.bind.annotation.GetMapping;

public class StarshipsController {
    private SwapiService swapiService;

    public StarshipsController(SwapiService swapiService) {
        this.swapiService = swapiService;
    }

    @GetMapping(value = "/starships")
    public ResultStarships getStarships() {
        return swapiService.getStarships();
    }
}
