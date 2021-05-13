package com.example.consumingrest.service;

import com.example.consumingrest.controller.VehiclesController;
import com.example.consumingrest.domain.*;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class SwapiService implements SwapiURL {
    private final RestTemplate restTemplate = new RestTemplate();

    public String getCategories() {
        StringBuilder sb = new StringBuilder();
        sb.append("people\n")
                .append("plantes\n")
                .append("species\n")
                .append("starships\n")
                .append("films\n")
                .append("vehicles\n");

        return sb.toString();
    }

    public Person getPerson(String id) {
        ResponseEntity<Person> response
                = restTemplate.getForEntity(String.format(PERSON,id), Person.class);

        return response.getBody();
    }
    public ResultPeople getPeople() {
        ResponseEntity<ResultPeople> response
                = restTemplate.getForEntity(PEOPLE, ResultPeople.class);

        return response.getBody();
    }

    public Planet getPlanet(String id) {
        ResponseEntity<Planet> response
                = restTemplate.getForEntity(String.format(PLANET, id), Planet.class);
        return response.getBody();
    }

    public ResultPlanets getPlanets() {
        ResponseEntity<ResultPlanets> response
                = restTemplate.getForEntity(PLANETS, ResultPlanets.class);
        return response.getBody();
    }

    public Species getSpecie(String id) {
        ResponseEntity<Species> response
                = restTemplate.getForEntity(String.format(BY_SPECIES,id), Species.class);
        return response.getBody();
    }

    public ResultSpecies getSpecies() {
        ResponseEntity<ResultSpecies> response
                = restTemplate.getForEntity(SPECIES, ResultSpecies.class);
        return response.getBody();
    }

    public Starship getStarship(String id) {
        ResponseEntity<Starship> response
                = restTemplate.getForEntity(String.format(STARSHIP, id), Starship.class);
        return response.getBody();
    }

    public ResultStarships getStarships() {
        ResponseEntity<ResultStarships> response
                = restTemplate.getForEntity(STARSHIPS, ResultStarships.class);
        return response.getBody();
    }

    public Film getFilm(String id) {
        ResponseEntity<Film> response
                = restTemplate.getForEntity(String.format(FILM, id), Film.class);
        return response.getBody();
    }

    public ResultFilms getFilms() {
        ResponseEntity<ResultFilms> response
                = restTemplate.getForEntity(FILMS, ResultFilms.class);
        return response.getBody();
    }

    public Vehicle getVehicle(String id) {
        ResponseEntity<Vehicle> response
                = restTemplate.getForEntity(String.format(VEHICLE, id), Vehicle.class);
        return response.getBody();
    }

    public ResultVehicles getVehicles() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<ResultVehicles> response
                = restTemplate.getForEntity(VEHICLES, ResultVehicles.class);
        return response.getBody();
    }
}
