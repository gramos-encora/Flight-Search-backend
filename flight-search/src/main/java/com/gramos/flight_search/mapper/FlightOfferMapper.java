package com.gramos.flight_search.mapper;

import com.gramos.flight_search.dto.FlightOfferDTO;
import com.gramos.flight_search.entity.flight_offer.FlightOffer;
import com.gramos.flight_search.entity.flight_offer.PricingOptions;
import com.gramos.flight_search.entity.flight_offer.itinerary.Itinerary;
import com.gramos.flight_search.entity.flight_offer.price.Price;
import com.gramos.flight_search.entity.flight_offer.traveler_pricing.TravelerPricing;

public class FlightOfferMapper {
    public static FlightOfferDTO mapToFlightOfferDto(FlightOffer flightOffer) {
        return new FlightOfferDTO(
                flightOffer.getId(),
                flightOffer.getItineraries(),
                flightOffer.getPrice(),
                flightOffer.getPricingOptions(),
                flightOffer.getTravelerPricings()
        );
    }

    public static FlightOffer mapToFlightOffer(FlightOfferDTO flightOfferDTO) {
        return new FlightOffer(
                flightOfferDTO.getId(),
                flightOfferDTO.getItineraries(),
                flightOfferDTO.getPrice(),
                flightOfferDTO.getPricingOptions(),
                flightOfferDTO.getTravelerPricings()
        );
    }
}
