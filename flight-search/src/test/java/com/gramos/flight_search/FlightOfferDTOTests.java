package com.gramos.flight_search;

import com.gramos.flight_search.dto.FlightOfferDTO;
import com.gramos.flight_search.entity.flight_offer.PricingOptions;
import com.gramos.flight_search.entity.flight_offer.itinerary.Itinerary;
import com.gramos.flight_search.entity.flight_offer.price.Price;
import com.gramos.flight_search.entity.flight_offer.traveler_pricing.TravelerPricing;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class FlightOfferDTOTests {

    @Test
    void testConstructorAndGetters() {
        Itinerary itinerary = mock(Itinerary.class);
        Price price = mock(Price.class);
        PricingOptions pricingOptions = mock(PricingOptions.class);
        TravelerPricing travelerPricing = mock(TravelerPricing.class);

        FlightOfferDTO dto = new FlightOfferDTO(
                "FO123",
                List.of(itinerary),
                price,
                pricingOptions,
                List.of(travelerPricing)
        );

        assertEquals("FO123", dto.getId());
        assertEquals(1, dto.getItineraries().size());
        assertEquals(price, dto.getPrice());
        assertEquals(pricingOptions, dto.getPricingOptions());
        assertEquals(1, dto.getTravelerPricings().size());
    }

    @Test
    void testSetters() {
        FlightOfferDTO dto = new FlightOfferDTO(null, null, null, null, null);

        Price newPrice = mock(Price.class);
        dto.setId("NEWID");
        dto.setPrice(newPrice);

        assertEquals("NEWID", dto.getId());
        assertEquals(newPrice, dto.getPrice());
    }
}
