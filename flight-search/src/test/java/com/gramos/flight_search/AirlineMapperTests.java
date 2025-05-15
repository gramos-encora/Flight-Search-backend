package com.gramos.flight_search;

import com.gramos.flight_search.dto.AirlineDTO;
import com.gramos.flight_search.entity.Airline;
import com.gramos.flight_search.mapper.AirlineMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirlineMapperTests {

    @Test
    void testMapToAirlineDTO() {
        Airline airline = new Airline("AA", "AAL", "American Airlines, Inc.", "American Airlines");

        AirlineDTO dto = AirlineMapper.mapToAirlineDTO(airline);

        assertEquals("AA", dto.getIataCode());
        assertEquals("AAL", dto.getIcaoCode());
        assertEquals("American Airlines, Inc.", dto.getBusinessName());
        assertEquals("American Airlines", dto.getCommonName());
    }

    @Test
    void testMapToAirline() {
        AirlineDTO dto = new AirlineDTO("DL", "DAL", "Delta Air Lines", "Delta");

        Airline airline = AirlineMapper.mapToAirline(dto);

        assertEquals("DL", airline.getIataCode());
        assertEquals("DAL", airline.getIcaoCode());
        assertEquals("Delta Air Lines", airline.getBusinessName());
        assertEquals("Delta", airline.getCommonName());
    }
}
