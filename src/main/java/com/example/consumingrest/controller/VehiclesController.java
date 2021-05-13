package com.example.consumingrest.controller;

import com.example.consumingrest.domain.Vehicle;
import com.example.consumingrest.service.ResultVehicles;
import com.example.consumingrest.service.SwapiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehiclesController {

    private SwapiService swapiService;

    public VehiclesController(SwapiService swapiService) {
        this.swapiService = swapiService;
    }


    @GetMapping(value = "/vehicles")
    public ResultVehicles getVehicles() {
        return swapiService.getVehicles();
    }

    @GetMapping(value = "/vehicle/{id}")
    public Vehicle getVehicleById(@PathVariable("id") String id) {
        return swapiService.getVehicle(id);
    }
}
