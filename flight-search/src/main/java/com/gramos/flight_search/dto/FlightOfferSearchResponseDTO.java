package com.gramos.flight_search.dto;

import com.gramos.flight_search.dto.amadeus.FlightOfferDictionariesDTO;

import java.util.List;

public class FlightOfferSearchResponseDTO {
    private List<FlightOfferDTO> data;
    private FlightOfferDictionariesDTO dictionaries;

    public FlightOfferSearchResponseDTO(List<FlightOfferDTO> data, FlightOfferDictionariesDTO dictionaries) {
        this.data = data;
        this.dictionaries = dictionaries;
    }

    public List<FlightOfferDTO> getData() {
        return data;
    }

    public void setData(List<FlightOfferDTO> data) {
        this.data = data;
    }

    public FlightOfferDictionariesDTO getDictionaries() {
        return dictionaries;
    }

    public void setDictionaries(FlightOfferDictionariesDTO dictionaries) {
        this.dictionaries = dictionaries;
    }
}
