package com.gramos.flight_search.controller;

import com.gramos.flight_search.client.AmadeusClient;
import com.gramos.flight_search.dto.FlightOfferDTO;
import com.gramos.flight_search.dto.FlightOfferSearchResponseDTO;
import com.gramos.flight_search.service.impl.FlightOfferService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/flight-offers")
public class FlightOfferController {

    private final FlightOfferService flightOfferService;

    public FlightOfferController(FlightOfferService flightOfferService) {
        this.flightOfferService = flightOfferService;
    }

    @GetMapping
    public ResponseEntity<FlightOfferSearchResponseDTO> getFlightOffers(
            @RequestParam String origin,
            @RequestParam String destination,
            @RequestParam String departureDate,
            @RequestParam(required = false) String returnDate,
            @RequestParam(defaultValue = "1") int adults,
            @RequestParam(defaultValue = "false") boolean nonStop,
            @RequestParam(defaultValue = "3") int max,
            @RequestParam(required = false) String currencyCode
    ) {
        FlightOfferSearchResponseDTO response = flightOfferService.searchFlightOffersWithDictionaries(
                origin, destination, departureDate, returnDate, adults, nonStop, max, currencyCode
        );
        return ResponseEntity.ok(response);
    }



}