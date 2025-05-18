package com.gramos.flight_search.entity.flight_offer.itinerary.segment;

import java.time.LocalDateTime;

public class FlightEndpoint {
    private String iataCode;
    private String terminal;
    private LocalDateTime at;

    public FlightEndpoint(String iataCode, String terminal, LocalDateTime at) {
        this.iataCode = iataCode;
        this.terminal = terminal;
        this.at = at;
    }

    public String getIataCode() {
        return iataCode;
    }

    public void setIataCode(String iataCode) {
        this.iataCode = iataCode;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public LocalDateTime getAt() {
        return at;
    }

    public void setAt(LocalDateTime at) {
        this.at = at;
    }
}
