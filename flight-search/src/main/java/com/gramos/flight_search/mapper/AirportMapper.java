package com.gramos.flight_search.mapper;

import com.gramos.flight_search.dto.AirportDTO;
import com.gramos.flight_search.entity.Airport;

public class AirportMapper {
    public static AirportDTO mapToAirportDto(Airport airport) {
        return new AirportDTO(
                airport.getId(),
                airport.getCityName(),
                airport.getCountryName(),
                airport.getIataCode()
        );
    }

    public static Airport mapToAirport(AirportDTO airportDTO) {
        return new Airport(
                airportDTO.getId(),
                airportDTO.getCityName(),
                airportDTO.getCountryName(),
                airportDTO.getIataCode()
        );
    }
}
