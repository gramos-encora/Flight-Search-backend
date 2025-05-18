package com.gramos.flight_search;

import com.gramos.flight_search.dto.AirportDTO;
import com.gramos.flight_search.entity.Airport;
import com.gramos.flight_search.mapper.AirportMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirportMapperTests {

    @Test
    void testMapToAirportDto() {
        Airport airport = new Airport("1", "New York", "USA", "JFK");

        AirportDTO dto = AirportMapper.mapToAirportDto(airport);

        assertEquals("1", dto.getId());
        assertEquals("New York", dto.getCityName());
        assertEquals("USA", dto.getCountryName());
        assertEquals("JFK", dto.getIataCode());
    }

    @Test
    void testMapToAirport() {
        AirportDTO dto = new AirportDTO("2", "Tokyo", "Japan", "NRT");

        Airport airport = AirportMapper.mapToAirport(dto);

        assertEquals("2", airport.getId());
        assertEquals("Tokyo", airport.getCityName());
        assertEquals("Japan", airport.getCountryName());
        assertEquals("NRT", airport.getIataCode());
    }
}
