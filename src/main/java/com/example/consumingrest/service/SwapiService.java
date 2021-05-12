package com.example.consumingrest.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class SwapiService {
    private static final String API_BASE = "https://swapi.dev/api/";
    private static final String PEOPLE = API_BASE + "people/";
    private static final String PLANETS = API_BASE + "planets/";
    private static final String SPECIES = API_BASE + "species/";
    private static final String STARSHIPS = API_BASE + "starships/";
    private static final String FILMS = API_BASE + "films/";
    private static final String VEHICLES = API_BASE + "vehicles/";

    public String getCategories() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response
                = restTemplate.getForEntity(API_BASE, String.class);

        return response.getBody();
    }

    public ResultPeople getPeople() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<ResultPeople> response
                = restTemplate.getForEntity(PEOPLE, ResultPeople.class);

        return response.getBody();
    }

    public ResultPlanets getPlanets() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<ResultPlanets> response
                = restTemplate.getForEntity(PLANETS, ResultPlanets.class);
        return response.getBody();
    }

    public ResultSpecies getSpecies() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<ResultSpecies> response
                = restTemplate.getForEntity(SPECIES, ResultSpecies.class);
        return response.getBody();
    }

    public ResultStarships getStarships() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<ResultStarships> response
                = restTemplate.getForEntity(STARSHIPS, ResultStarships.class);
        return response.getBody();
    }

    public ResultFilms getFilms() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<ResultFilms> response
                = restTemplate.getForEntity(FILMS, ResultFilms.class);
        return response.getBody();
    }

    public ResultVehicles getVehicles() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<ResultVehicles> response
                = restTemplate.getForEntity(VEHICLES, ResultVehicles.class);
        return response.getBody();
    }
}
