package com.gramos.flight_search.dto.amadeus;

public class AmadeusAirportData {
    private String type;
    private String subType;
    private String name;
    private String detailedName;
    private String id;
    private String timeZoneOffset;
    private String iataCode;
    private GeoCode geoCode;
    private Address address;
    private Analytics analytics;

    // Getters y setters
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getSubType() { return subType; }
    public void setSubType(String subType) { this.subType = subType; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDetailedName() { return detailedName; }
    public void setDetailedName(String detailedName) { this.detailedName = detailedName; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getTimeZoneOffset() { return timeZoneOffset; }
    public void setTimeZoneOffset(String timeZoneOffset) { this.timeZoneOffset = timeZoneOffset; }

    public String getIataCode() { return iataCode; }
    public void setIataCode(String iataCode) { this.iataCode = iataCode; }

    public GeoCode getGeoCode() { return geoCode; }
    public void setGeoCode(GeoCode geoCode) { this.geoCode = geoCode; }

    public Address getAddress() { return address; }
    public void setAddress(Address address) { this.address = address; }

    public Analytics getAnalytics() { return analytics; }
    public void setAnalytics(Analytics analytics) { this.analytics = analytics; }

    // Subclases con sus getters y setters

    public static class GeoCode {
        private double latitude;
        private double longitude;

        public double getLatitude() { return latitude; }
        public void setLatitude(double latitude) { this.latitude = latitude; }

        public double getLongitude() { return longitude; }
        public void setLongitude(double longitude) { this.longitude = longitude; }
    }

    public static class Address {
        private String cityName;
        private String cityCode;
        private String countryName;
        private String countryCode;
        private String regionCode;

        public String getCityName() { return cityName; }
        public void setCityName(String cityName) { this.cityName = cityName; }

        public String getCityCode() { return cityCode; }
        public void setCityCode(String cityCode) { this.cityCode = cityCode; }

        public String getCountryName() { return countryName; }
        public void setCountryName(String countryName) { this.countryName = countryName; }

        public String getCountryCode() { return countryCode; }
        public void setCountryCode(String countryCode) { this.countryCode = countryCode; }

        public String getRegionCode() { return regionCode; }
        public void setRegionCode(String regionCode) { this.regionCode = regionCode; }
    }

    public static class Analytics {
        private Travelers travelers;

        public Travelers getTravelers() { return travelers; }
        public void setTravelers(Travelers travelers) { this.travelers = travelers; }

        public static class Travelers {
            private int score;

            public int getScore() { return score; }
            public void setScore(int score) { this.score = score; }
        }
    }
}
