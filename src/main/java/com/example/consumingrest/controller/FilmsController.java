package com.example.consumingrest.controller;

import com.example.consumingrest.service.ResultFilms;
import com.example.consumingrest.service.SwapiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilmsController {
    private SwapiService swapiService;

    public FilmsController(SwapiService swapiService) {
        this.swapiService = swapiService;
    }

    @GetMapping(value = "/films")
    public ResultFilms getFilms() {
        return swapiService.getFilms();
    }

}
