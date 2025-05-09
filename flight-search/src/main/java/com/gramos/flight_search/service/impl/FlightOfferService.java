package com.gramos.flight_search.service.impl;

import com.gramos.flight_search.client.AmadeusClient;
import com.gramos.flight_search.dto.FlightOfferDTO;
import com.gramos.flight_search.dto.FlightOfferSearchResponseDTO;
import com.gramos.flight_search.dto.amadeus.AmadeusFlightOfferResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightOfferService {

    private final AmadeusClient amadeusClient;

    public FlightOfferService(AmadeusClient amadeusClient) {
        this.amadeusClient = amadeusClient;
    }

    public FlightOfferSearchResponseDTO searchFlightOffersWithDictionaries(
            String origin, String destination, String departureDate, String returnDate,
            int adults, boolean nonStop, int max, String currencyCode
    ) {
        AmadeusFlightOfferResponse response = amadeusClient.fetchFlightOffers(
                origin, destination, departureDate, returnDate, adults, nonStop, max, currencyCode
        );

        return new FlightOfferSearchResponseDTO(response.getData(), response.getDictionaries());
    }

}
