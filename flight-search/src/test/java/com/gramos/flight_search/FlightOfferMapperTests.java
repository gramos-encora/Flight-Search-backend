package com.gramos.flight_search;

import com.gramos.flight_search.dto.FlightOfferDTO;
import com.gramos.flight_search.entity.flight_offer.FlightOffer;
import com.gramos.flight_search.entity.flight_offer.PricingOptions;
import com.gramos.flight_search.entity.flight_offer.itinerary.Itinerary;
import com.gramos.flight_search.entity.flight_offer.price.Price;
import com.gramos.flight_search.entity.flight_offer.traveler_pricing.TravelerPricing;
import com.gramos.flight_search.mapper.FlightOfferMapper;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class FlightOfferMapperTests {

    @Test
    void testMapToFlightOfferDto() {
        Itinerary itinerary = mock(Itinerary.class);
        Price price = mock(Price.class);
        PricingOptions pricingOptions = mock(PricingOptions.class);
        TravelerPricing travelerPricing = mock(TravelerPricing.class);

        FlightOffer flightOffer = new FlightOffer("F001", List.of(itinerary), price, pricingOptions, List.of(travelerPricing));

        FlightOfferDTO dto = FlightOfferMapper.mapToFlightOfferDto(flightOffer);

        assertEquals("F001", dto.getId());
        assertEquals(price, dto.getPrice());
        assertEquals(pricingOptions, dto.getPricingOptions());
        assertEquals(1, dto.getItineraries().size());
        assertEquals(1, dto.getTravelerPricings().size());
    }

    @Test
    void testMapToFlightOffer() {
        Itinerary itinerary = mock(Itinerary.class);
        Price price = mock(Price.class);
        PricingOptions pricingOptions = mock(PricingOptions.class);
        TravelerPricing travelerPricing = mock(TravelerPricing.class);

        FlightOfferDTO dto = new FlightOfferDTO("F002", List.of(itinerary), price, pricingOptions, List.of(travelerPricing));

        FlightOffer flightOffer = FlightOfferMapper.mapToFlightOffer(dto);

        assertEquals("F002", flightOffer.getId());
        assertEquals(price, flightOffer.getPrice());
        assertEquals(pricingOptions, flightOffer.getPricingOptions());
        assertEquals(1, flightOffer.getItineraries().size());
        assertEquals(1, flightOffer.getTravelerPricings().size());
    }
}
