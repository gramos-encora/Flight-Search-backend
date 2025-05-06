package com.gramos.flight_search.dto;

public class AirportDTO {
    private String id;
    private String cityName;
    private String countryName;
    private String iataCode;

    public AirportDTO(String id, String cityName, String countryName, String iataCode) {
        this.id = id;
        this.cityName = cityName;
        this.countryName = countryName;
        this.iataCode = iataCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getIataCode() {
        return iataCode;
    }

    public void setIataCode(String iataCode) {
        this.iataCode = iataCode;
    }
}
