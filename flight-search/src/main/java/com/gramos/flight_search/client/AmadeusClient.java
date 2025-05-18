package com.gramos.flight_search.client;

import com.gramos.flight_search.dto.AirportDTO;
import com.gramos.flight_search.dto.FlightOfferDTO;
import com.gramos.flight_search.dto.amadeus.AmadeusAirlineData;
import com.gramos.flight_search.dto.amadeus.AmadeusAirlineResponse;
import com.gramos.flight_search.dto.amadeus.AmadeusAirportResponse;
import com.gramos.flight_search.dto.amadeus.AmadeusFlightOfferResponse;
import com.gramos.flight_search.entity.Airline;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class AmadeusClient {

    private final RestTemplate restTemplate;
    private final String baseUrl;
    private final AmadeusAuthClient authClient;

    public AmadeusClient(RestTemplate restTemplate,
                         @Value("${amadeus.api.base-url}") String baseUrl,
                         AmadeusAuthClient authClient) {
        this.restTemplate = restTemplate;
        this.baseUrl = baseUrl;
        this.authClient = authClient;
    }

    public Airline fetchAirlineByIata(String iataCode) {
        String accessToken = authClient.getAccessToken();

        String url = String.format("%s/v1/reference-data/airlines?airlineCodes=%s", baseUrl, iataCode);

        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(accessToken);

        HttpEntity<Void> request = new HttpEntity<>(headers);

        ResponseEntity<AmadeusAirlineResponse> response = restTemplate.exchange(
                url, HttpMethod.GET, request, AmadeusAirlineResponse.class
        );

        if (response.getBody() != null && response.getBody().getData() != null && !response.getBody().getData().isEmpty()) {
            AmadeusAirlineData data = response.getBody().getData().get(0);
            return new Airline(data.getIataCode(), data.getIcaoCode(), data.getBusinessName(), data.getCommonName());
        }

        return null;
    }

    public List<AirportDTO> fetchAirportsAndCities(String keyword) {
        String accessToken = authClient.getAccessToken();

        String url = String.format("%s/v1/reference-data/locations?subType=CITY,AIRPORT&keyword=%s", baseUrl, keyword);

        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(accessToken);

        HttpEntity<Void> request = new HttpEntity<>(headers);

        ResponseEntity<AmadeusAirportResponse> response = restTemplate.exchange(
                url, HttpMethod.GET, request, AmadeusAirportResponse.class
        );

        if (response.getBody() == null || response.getBody().getData() == null) {
            return List.of();
        }

        return response.getBody().getData().stream()
                .map(data -> new AirportDTO(
                        data.getId(),
                        data.getAddress().getCityName(),
                        data.getAddress().getCountryName(),
                        data.getIataCode()
                ))
                .collect(Collectors.toList());
    }

    public AmadeusFlightOfferResponse fetchFlightOffers(
            String origin,
            String destination,
            String departureDate,
            String returnDate,     // optional
            int adults,
            boolean nonStop,
            int max,
            String currencyCode    // optional
    ) {
        String accessToken = authClient.getAccessToken();

        StringBuilder urlBuilder = new StringBuilder(String.format(
                "%s/v2/shopping/flight-offers?originLocationCode=%s&destinationLocationCode=%s&departureDate=%s&adults=%d&nonStop=%b&max=%d",
                baseUrl, origin, destination, departureDate, adults, nonStop, max
        ));

        if (returnDate != null && !returnDate.isBlank()) {
            urlBuilder.append("&returnDate=").append(returnDate);
        }

        if (currencyCode != null && !currencyCode.isBlank()) {
            urlBuilder.append("&currencyCode=").append(currencyCode);
        }

        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(accessToken);

        HttpEntity<Void> request = new HttpEntity<>(headers);

        ResponseEntity<AmadeusFlightOfferResponse> response = restTemplate.exchange(
                urlBuilder.toString(), HttpMethod.GET, request, AmadeusFlightOfferResponse.class
        );

        return response.getBody();  // incluye data y dictionaries
    }
}

