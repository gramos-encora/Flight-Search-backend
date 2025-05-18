package com.gramos.flight_search.service.impl;

import com.gramos.flight_search.client.AmadeusClient;
import com.gramos.flight_search.dto.AirlineDTO;
import com.gramos.flight_search.entity.Airline;
import com.gramos.flight_search.mapper.AirlineMapper;
import org.springframework.stereotype.Service;

@Service
public class AirlineService {
    private final AmadeusClient amadeusClient;

    public AirlineService(AmadeusClient amadeusClient) {
        this.amadeusClient = amadeusClient;
    }

    public AirlineDTO getAirlineByIataCode(String iataCode) {
        System.out.println("AirlineService");
        Airline airline = amadeusClient.fetchAirlineByIata(iataCode);
        return AirlineMapper.mapToAirlineDTO(airline);
    }
}
