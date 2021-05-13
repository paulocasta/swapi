package com.example.consumingrest.service;

public interface SwapiURL {
    String API_BASE = "https://swapi.dev/api/";
    String PERSON = API_BASE + "people/%s/";
    String PEOPLE = API_BASE + "people/";
    String PLANET = API_BASE + "planets/%s/";
    String PLANETS = API_BASE + "planets/";
    String BY_SPECIES = API_BASE + "species/%s/";
    String SPECIES = API_BASE + "species/";
    String FILM = API_BASE + "films/%s/";
    String FILMS = API_BASE + "films/";
    String VEHICLE = API_BASE + "vehicles/%s/";
    String VEHICLES = API_BASE + "vehicles/";
    String STARSHIP = API_BASE + "starships/%s/";
    String STARSHIPS = API_BASE + "starships/";
}
