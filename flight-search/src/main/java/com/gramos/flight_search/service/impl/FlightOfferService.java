package com.gramos.flight_search.service.impl;

import com.gramos.flight_search.client.AmadeusClient;
import com.gramos.flight_search.dto.FlightOfferDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightOfferService {

    private final AmadeusClient amadeusClient;

    public FlightOfferService(AmadeusClient amadeusClient) {
        this.amadeusClient = amadeusClient;
    }

    public List<FlightOfferDTO> searchFlightOffers(
            String origin,
            String destination,
            String departureDate,
            String returnDate,     // optional
            int adults,
            boolean nonStop,
            int max,
            String currencyCode    // optional
    ) {
        return amadeusClient.fetchFlightOffers(
                origin, destination, departureDate, returnDate, adults, nonStop, max, currencyCode
        );
    }

}
