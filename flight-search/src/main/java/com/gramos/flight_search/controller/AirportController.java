package com.gramos.flight_search.controller;

import com.gramos.flight_search.dto.AirportDTO;
import com.gramos.flight_search.dto.amadeus.AmadeusAirportResponse;
import com.gramos.flight_search.service.impl.AirportService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/airports")
public class AirportController {

    private final AirportService airportService;

    public AirportController(AirportService airportService) {
        this.airportService = airportService;
    }

    @GetMapping("/{keyword}")
    public List<AirportDTO> getAirportsAndCities(@PathVariable("keyword") String keyword) {
        return airportService.searchAirports(keyword);
    }
}

