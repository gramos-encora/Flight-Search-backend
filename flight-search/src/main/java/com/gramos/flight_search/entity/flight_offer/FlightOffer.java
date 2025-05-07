package com.gramos.flight_search.entity.flight_offer;

import com.gramos.flight_search.entity.flight_offer.itinerary.Itinerary;
import com.gramos.flight_search.entity.flight_offer.price.Price;
import com.gramos.flight_search.entity.flight_offer.traveler_pricing.TravelerPricing;

import java.util.List;

public class FlightOffer {
    private String id;
    private List<Itinerary> itineraries;
    private Price price;
    private PricingOptions pricingOptions;

    private List<TravelerPricing> travelerPricings;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Itinerary> getItineraries() {
        return itineraries;
    }

    public void setItineraries(List<Itinerary> itineraries) {
        this.itineraries = itineraries;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public PricingOptions getPricingOptions() {
        return pricingOptions;
    }

    public void setPricingOptions(PricingOptions pricingOptions) {
        this.pricingOptions = pricingOptions;
    }

    public List<TravelerPricing> getTravelerPricings() {
        return travelerPricings;
    }

    public void setTravelerPricings(List<TravelerPricing> travelerPricings) {
        this.travelerPricings = travelerPricings;
    }

    public FlightOffer(String id, List<Itinerary> itineraries, Price price, PricingOptions pricingOptions, List<TravelerPricing> travelerPricings) {
        this.id = id;
        this.itineraries = itineraries;
        this.price = price;
        this.pricingOptions = pricingOptions;
        this.travelerPricings = travelerPricings;
    }
}
