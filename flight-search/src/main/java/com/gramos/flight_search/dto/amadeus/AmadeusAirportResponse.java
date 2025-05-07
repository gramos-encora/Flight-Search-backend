package com.gramos.flight_search.dto.amadeus;

import java.util.List;

public class AmadeusAirportResponse {
    private List<AmadeusAirportData> data;

    public List<AmadeusAirportData> getData() {
        return data;
    }

    public void setData(List<AmadeusAirportData> data) {
        this.data = data;
    }
}


