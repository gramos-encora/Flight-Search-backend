package com.gramos.flight_search.dto;

public class AirlineDTO {
    private String iataCode;
    private String icaoCode;
    private String businessName;
    private String commonName;

    public AirlineDTO(String iataCode, String icaoCode, String businessName, String commonName) {
        this.iataCode = iataCode;
        this.icaoCode = icaoCode;
        this.businessName = businessName;
        this.commonName = commonName;
    }

    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getIcaoCode() {
        return icaoCode;
    }

    public void setIcaoCode(String icaoCode) {
        this.icaoCode = icaoCode;
    }

    public String getIataCode() {
        return iataCode;
    }

    public void setIataCode(String iataCode) {
        this.iataCode = iataCode;
    }
}
