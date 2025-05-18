package com.gramos.flight_search.entity.flight_offer.traveler_pricing;

import com.gramos.flight_search.entity.flight_offer.traveler_pricing.fare_details_by_segment.FareDetailsBySegment;
import com.gramos.flight_search.entity.flight_offer.price.Price;

import java.util.List;

public class TravelerPricing {
    private String travelerId;
    private String fareOption;
    private String travelerType;
    private Price price;
    private List<FareDetailsBySegment> fareDetailsBySegment;

    public String getTravelerId() {
        return travelerId;
    }

    public void setTravelerId(String travelerId) {
        this.travelerId = travelerId;
    }

    public String getFareOption() {
        return fareOption;
    }

    public void setFareOption(String fareOption) {
        this.fareOption = fareOption;
    }

    public String getTravelerType() {
        return travelerType;
    }

    public void setTravelerType(String travelerType) {
        this.travelerType = travelerType;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public List<FareDetailsBySegment> getFareDetailsBySegment() {
        return fareDetailsBySegment;
    }

    public void setFareDetailsBySegment(List<FareDetailsBySegment> fareDetailsBySegment) {
        this.fareDetailsBySegment = fareDetailsBySegment;
    }

    public TravelerPricing(String travelerId, String fareOption, String travelerType, Price price, List<FareDetailsBySegment> fareDetailsBySegment) {
        this.travelerId = travelerId;
        this.fareOption = fareOption;
        this.travelerType = travelerType;
        this.price = price;
        this.fareDetailsBySegment = fareDetailsBySegment;
    }
}
