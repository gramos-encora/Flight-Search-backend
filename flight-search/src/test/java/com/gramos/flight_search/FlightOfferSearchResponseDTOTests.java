package com.gramos.flight_search;

import com.gramos.flight_search.dto.FlightOfferDTO;
import com.gramos.flight_search.dto.FlightOfferSearchResponseDTO;
import com.gramos.flight_search.dto.amadeus.FlightOfferDictionariesDTO;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class FlightOfferSearchResponseDTOTests {

    @Test
    void testConstructorAndGetters() {
        FlightOfferDTO offer = mock(FlightOfferDTO.class);
        FlightOfferDictionariesDTO dictionaries = mock(FlightOfferDictionariesDTO.class);

        FlightOfferSearchResponseDTO response = new FlightOfferSearchResponseDTO(
                List.of(offer), dictionaries
        );

        assertEquals(1, response.getData().size());
        assertEquals(dictionaries, response.getDictionaries());
    }

    @Test
    void testSetters() {
        FlightOfferSearchResponseDTO response = new FlightOfferSearchResponseDTO(null, null);

        FlightOfferDTO newOffer = mock(FlightOfferDTO.class);
        FlightOfferDictionariesDTO newDictionaries = mock(FlightOfferDictionariesDTO.class);

        response.setData(List.of(newOffer));
        response.setDictionaries(newDictionaries);

        assertEquals(1, response.getData().size());
        assertEquals(newDictionaries, response.getDictionaries());
    }
}
