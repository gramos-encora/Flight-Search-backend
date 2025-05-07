package com.gramos.flight_search.dto.amadeus;

import java.util.List;

public class AmadeusAirlineResponse {
    private List<AmadeusAirlineData> data;

    public List<AmadeusAirlineData> getData() {
        return data;
    }

    public void setData(List<AmadeusAirlineData> data) {
        this.data = data;
    }
}
