package com.gramos.flight_search.dto.amadeus;

import com.gramos.flight_search.dto.FlightOfferDTO;

import java.util.List;

public class AmadeusFlightOfferResponse {
    private FlightOfferDictionariesDTO dictionaries;
    private List<FlightOfferDTO> data;

    public FlightOfferDictionariesDTO getDictionaries() {
        return dictionaries;
    }

    public void setDictionaries(FlightOfferDictionariesDTO dictionaries) {
        this.dictionaries = dictionaries;
    }

    public List<FlightOfferDTO> getData() {
        return data;
    }

    public void setData(List<FlightOfferDTO> data) {
        this.data = data;
    }
}

