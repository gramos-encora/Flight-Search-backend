package com.gramos.flight_search;

import com.gramos.flight_search.dto.AirlineDTO;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirlineDTOTests {

    @Test
    void testConstructorAndGetters() {
        AirlineDTO airline = new AirlineDTO("AA", "AAL", "American Airlines", "American");

        assertEquals("AA", airline.getIataCode());
        assertEquals("AAL", airline.getIcaoCode());
        assertEquals("American Airlines", airline.getBusinessName());
        assertEquals("American", airline.getCommonName());
    }

    @Test
    void testSetters() {
        AirlineDTO airline = new AirlineDTO(null, null, null, null);

        airline.setIataCode("DL");
        airline.setIcaoCode("DAL");
        airline.setBusinessName("Delta Air Lines");
        airline.setCommonName("Delta");

        assertEquals("DL", airline.getIataCode());
        assertEquals("DAL", airline.getIcaoCode());
        assertEquals("Delta Air Lines", airline.getBusinessName());
        assertEquals("Delta", airline.getCommonName());
    }
}
