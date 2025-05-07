package com.gramos.flight_search.client;

import com.gramos.flight_search.dto.amadeus.AmadeusAirlineData;
import com.gramos.flight_search.dto.amadeus.AmadeusAirlineResponse;
import com.gramos.flight_search.entity.Airline;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

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
}

