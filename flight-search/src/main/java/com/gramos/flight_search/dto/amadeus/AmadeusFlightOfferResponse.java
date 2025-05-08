package com.gramos.flight_search.dto.amadeus;

import com.gramos.flight_search.dto.FlightOfferDTO;

import java.util.List;

public class AmadeusFlightOfferResponse {
    private List<FlightOfferDTO> data;

    public List<FlightOfferDTO> getData() {
        return data;
    }

    public void setData(List<FlightOfferDTO> data) {
        this.data = data;
    }
}
