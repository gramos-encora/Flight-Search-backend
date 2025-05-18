package com.gramos.flight_search;

import com.gramos.flight_search.controller.AirportController;
import com.gramos.flight_search.dto.AirportDTO;
import com.gramos.flight_search.service.impl.AirportService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class AirportControllerTests {

    private AirportService airportService;
    private AirportController airportController;

    @BeforeEach
    void setUp() {
        airportService = mock(AirportService.class);
        airportController = new AirportController(airportService);
    }

    @Test
    void testGetAirportsAndCities() {
        String keyword = "paris";
        List<AirportDTO> expectedList = List.of(new AirportDTO("1", "Paris", "France", "CDG"));

        when(airportService.searchAirports(keyword)).thenReturn(expectedList);

        List<AirportDTO> result = airportController.getAirportsAndCities(keyword);

        assertEquals(expectedList, result);
        verify(airportService, times(1)).searchAirports(keyword);
    }
}
