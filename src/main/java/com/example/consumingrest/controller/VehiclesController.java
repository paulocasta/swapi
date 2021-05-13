package com.example.consumingrest.controller;

import com.example.consumingrest.service.ResultVehicles;
import com.example.consumingrest.service.SwapiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehiclesController {

    private SwapiService swapiService;

    public VehiclesController(SwapiService swapiService) {
        this.swapiService = swapiService;
    }


    @GetMapping(value = "/vehicles")
    @ResponseBody
    public ResultVehicles getVehicles() {
        return swapiService.getVehicles();
    }
}
