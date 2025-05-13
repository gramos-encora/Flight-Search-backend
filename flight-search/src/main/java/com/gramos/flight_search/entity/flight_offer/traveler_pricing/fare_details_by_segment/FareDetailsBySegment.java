package com.gramos.flight_search.entity.flight_offer.traveler_pricing.fare_details_by_segment;

public class FareDetailsBySegment {
    private String segmentId;
    private String cabin;
    private String fareBasis;
    private String clazz; // 'class' reserved keyword
    private Bag includedCheckedBags;
    private Bag includedCabinBags;
    private Amenity[] amenities;

    public FareDetailsBySegment(String segmentId, String cabin, String fareBasis, String clazz, Bag includedCheckedBags, Bag includedCabinBags, Amenity[] amenities) {
        this.segmentId = segmentId;
        this.cabin = cabin;
        this.fareBasis = fareBasis;
        this.clazz = clazz;
        this.includedCheckedBags = includedCheckedBags;
        this.includedCabinBags = includedCabinBags;
        this.amenities = amenities;
    }

    public String getSegmentId() {
        return segmentId;
    }

    public void setSegmentId(String segmentId) {
        this.segmentId = segmentId;
    }

    public String getCabin() {
        return cabin;
    }

    public void setCabin(String cabin) {
        this.cabin = cabin;
    }

    public String getFareBasis() {
        return fareBasis;
    }

    public void setFareBasis(String fareBasis) {
        this.fareBasis = fareBasis;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public Bag getIncludedCheckedBags() {
        return includedCheckedBags;
    }

    public void setIncludedCheckedBags(Bag includedCheckedBags) {
        this.includedCheckedBags = includedCheckedBags;
    }

    public Bag getIncludedCabinBags() {
        return includedCabinBags;
    }

    public void setIncludedCabinBags(Bag includedCabinBags) {
        this.includedCabinBags = includedCabinBags;
    }

    public Amenity[] getAmenities() {
        return amenities;
    }

    public void setAmenities(Amenity[] amenities) {
        this.amenities = amenities;
    }
}
