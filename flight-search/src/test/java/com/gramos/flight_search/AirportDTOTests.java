package com.gramos.flight_search;
import com.gramos.flight_search.dto.AirportDTO;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirportDTOTests {

    @Test
    void testConstructorAndGetters() {
        AirportDTO airport = new AirportDTO("1", "Tokyo", "Japan", "NRT");

        assertEquals("1", airport.getId());
        assertEquals("Tokyo", airport.getCityName());
        assertEquals("Japan", airport.getCountryName());
        assertEquals("NRT", airport.getIataCode());
    }

    @Test
    void testSetters() {
        AirportDTO airport = new AirportDTO(null, null, null, null);

        airport.setId("2");
        airport.setCityName("Osaka");
        airport.setCountryName("Japan");
        airport.setIataCode("KIX");

        assertEquals("2", airport.getId());
        assertEquals("Osaka", airport.getCityName());
        assertEquals("Japan", airport.getCountryName());
        assertEquals("KIX", airport.getIataCode());
    }
}
