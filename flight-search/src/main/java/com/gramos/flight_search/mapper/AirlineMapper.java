package com.gramos.flight_search.mapper;

import com.gramos.flight_search.dto.AirlineDTO;
import com.gramos.flight_search.entity.Airline;

public class AirlineMapper {

    public static AirlineDTO mapToAirlineDTO(Airline airline) {
        return new AirlineDTO(
                airline.getIataCode(),
                airline.getIcaoCode(),
                airline.getBusinessName(),
                airline.getCommonName()
        );
    }

    public static Airline mapToAirline(AirlineDTO airlineDTO) {
        return new Airline(
                airlineDTO.getIataCode(),
                airlineDTO.getIcaoCode(),
                airlineDTO.getBusinessName(),
                airlineDTO.getCommonName()
        );
    }
}
