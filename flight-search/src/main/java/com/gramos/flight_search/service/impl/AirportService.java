package com.gramos.flight_search.service.impl;

import com.gramos.flight_search.cache.AirportCache;
import com.gramos.flight_search.client.AmadeusClient;
import com.gramos.flight_search.dto.AirportDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirportService {

    private final AmadeusClient amadeusClient;
    private final AirportCache airportCache;

    public AirportService(AmadeusClient amadeusClient, AirportCache airportCache) {
        this.amadeusClient = amadeusClient;
        this.airportCache = airportCache;
    }

    public List<AirportDTO> searchAirports(String keyword) {
        if (airportCache.contains(keyword)) {
            return airportCache.getByKeyword(keyword);
        }

        List<AirportDTO> result = amadeusClient.fetchAirportsAndCities(keyword);

        if (!result.isEmpty()) {
            airportCache.put(keyword, result);
        }

        return result;
    }
}

