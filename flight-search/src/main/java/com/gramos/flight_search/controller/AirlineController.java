package com.gramos.flight_search.controller;

import com.gramos.flight_search.dto.AirlineDTO;
import com.gramos.flight_search.service.impl.AirlineService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/airlines")
public class AirlineController {
    private static final Logger log = LoggerFactory.getLogger(AirlineController.class);
    private final AirlineService airlineService;

    public AirlineController(AirlineService airlineService) {
        this.airlineService = airlineService;
    }

    @GetMapping("{iataCode}")
    public ResponseEntity<AirlineDTO> getAirline(@PathVariable("iataCode") String iataCode) {
        System.out.println("AirlineController");
        AirlineDTO airline = airlineService.getAirlineByIataCode(iataCode);
        return ResponseEntity.ok(airline);
    }
}
