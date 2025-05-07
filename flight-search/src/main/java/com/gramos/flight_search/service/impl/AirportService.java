package com.gramos.flight_search.service.impl;

import com.gramos.flight_search.client.AmadeusClient;
import com.gramos.flight_search.dto.AirportDTO;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AirportService {

    private final AmadeusClient amadeusClient;

    public AirportService(AmadeusClient amadeusClient) {
        this.amadeusClient = amadeusClient;
    }

    public List<AirportDTO> searchAirports(String keyword) {
        return amadeusClient.fetchAirportsAndCities(keyword);
    }
}
