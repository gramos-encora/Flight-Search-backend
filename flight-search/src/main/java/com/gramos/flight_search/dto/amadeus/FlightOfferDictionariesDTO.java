package com.gramos.flight_search.dto.amadeus;

import java.util.Map;

public class FlightOfferDictionariesDTO {
    private Map<String, LocationInfo> locations;
    private Map<String, String> aircraft;
    private Map<String, String> currencies;
    private Map<String, String> carriers;

    public static class LocationInfo {
        private String cityCode;
        private String countryCode;

        public LocationInfo(String cityCode, String countryCode) {
            this.cityCode = cityCode;
            this.countryCode = countryCode;
        }

        public String getCountryCode() {
            return countryCode;
        }

        public void setCountryCode(String countryCode) {
            this.countryCode = countryCode;
        }

        public String getCityCode() {
            return cityCode;
        }

        public void setCityCode(String cityCode) {
            this.cityCode = cityCode;
        }
    }

    public FlightOfferDictionariesDTO(Map<String, String> carriers, Map<String, String> currencies, Map<String, String> aircraft, Map<String, LocationInfo> locations) {
        this.carriers = carriers;
        this.currencies = currencies;
        this.aircraft = aircraft;
        this.locations = locations;
    }

    public Map<String, LocationInfo> getLocations() {
        return locations;
    }

    public void setLocations(Map<String, LocationInfo> locations) {
        this.locations = locations;
    }

    public Map<String, String> getAircraft() {
        return aircraft;
    }

    public void setAircraft(Map<String, String> aircraft) {
        this.aircraft = aircraft;
    }

    public Map<String, String> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(Map<String, String> currencies) {
        this.currencies = currencies;
    }

    public Map<String, String> getCarriers() {
        return carriers;
    }

    public void setCarriers(Map<String, String> carriers) {
        this.carriers = carriers;
    }
}
