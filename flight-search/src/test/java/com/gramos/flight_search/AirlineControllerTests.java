package com.gramos.flight_search;

import com.gramos.flight_search.controller.AirlineController;
import com.gramos.flight_search.dto.AirlineDTO;
import com.gramos.flight_search.service.impl.AirlineService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class AirlineControllerTests {

    private AirlineService airlineService;
    private AirlineController airlineController;

    @BeforeEach
    void setUp() {
        airlineService = mock(AirlineService.class);
        airlineController = new AirlineController(airlineService);
    }

    @Test
    void testGetAirline() {
        String iataCode = "AA";
        AirlineDTO mockAirline = new AirlineDTO(iataCode, "AAL", "American Airlines Inc.", "American Airlines");

        when(airlineService.getAirlineByIataCode(iataCode)).thenReturn(mockAirline);

        ResponseEntity<AirlineDTO> response = airlineController.getAirline(iataCode);

        assertEquals(200, response.getStatusCodeValue());
        assertEquals(mockAirline, response.getBody());
        verify(airlineService, times(1)).getAirlineByIataCode(iataCode);
    }
}
