package com.example.consumingrest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class ConsumingRestApplication {
    private static final Logger log = LoggerFactory.getLogger(ConsumingRestApplication.class);
    private static final String API_BASE = "https://swapi.dev/api/";

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(ConsumingRestApplication.class);
        app.setDefaultProperties(Collections
                .singletonMap("server.port", "8083"));
        app.run(args);
    }


}
