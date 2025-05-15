package com.gramos.flight_search;

import com.gramos.flight_search.controller.FlightOfferController;
import com.gramos.flight_search.dto.FlightOfferSearchResponseDTO;
import com.gramos.flight_search.service.impl.FlightOfferService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class FlightOfferControllerTests {

    private FlightOfferService flightOfferService;
    private FlightOfferController flightOfferController;

    @BeforeEach
    void setUp() {
        flightOfferService = mock(FlightOfferService.class);
        flightOfferController = new FlightOfferController(flightOfferService);
    }

    @Test
    void testGetFlightOffers() {
        String origin = "MEX";
        String destination = "JFK";
        String departureDate = "2025-06-01";
        String returnDate = "2025-06-10";
        int adults = 1;
        boolean nonStop = false;
        int max = 3;
        String currencyCode = "USD";

        FlightOfferSearchResponseDTO mockResponse = new FlightOfferSearchResponseDTO(null, null);
        when(flightOfferService.searchFlightOffersWithDictionaries(origin, destination, departureDate, returnDate, adults, nonStop, max, currencyCode)).thenReturn(mockResponse);

        ResponseEntity<FlightOfferSearchResponseDTO> response = flightOfferController.getFlightOffers(origin, destination, departureDate, returnDate, adults, nonStop, max, currencyCode);

        assertEquals(200, response.getStatusCodeValue());
        assertEquals(mockResponse, response.getBody());
        verify(flightOfferService, times(1)).searchFlightOffersWithDictionaries(origin, destination, departureDate, returnDate, adults, nonStop, max, currencyCode);
    }
}

