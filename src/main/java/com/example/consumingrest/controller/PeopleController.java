package com.example.consumingrest.controller;

import com.example.consumingrest.domain.Person;
import com.example.consumingrest.service.ResultPeople;
import com.example.consumingrest.service.SwapiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PeopleController {

    private SwapiService swapiService;

    public PeopleController(SwapiService swapiService) {
        this.swapiService = swapiService;
    }


    @GetMapping(value = "/people")
    public ResultPeople getPeople() {
        return swapiService.getPeople();
    }

    @GetMapping(value = "/person/{id}")
    public Person getVehicleById(@PathVariable("id") String id) {
        return swapiService.getPerson(id);
    }
}
