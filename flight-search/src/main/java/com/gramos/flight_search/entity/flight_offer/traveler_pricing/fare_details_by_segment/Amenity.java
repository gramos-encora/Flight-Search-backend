package com.gramos.flight_search.entity.flight_offer.traveler_pricing.fare_details_by_segment;

public class Amenity {
    private String description;
    private boolean isChargeable;

    public Amenity(boolean isChargeable, String description) {
        this.isChargeable = isChargeable;
        this.description = description;
    }

    public boolean isChargeable() {
        return isChargeable;
    }

    public void setChargeable(boolean chargeable) {
        isChargeable = chargeable;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
