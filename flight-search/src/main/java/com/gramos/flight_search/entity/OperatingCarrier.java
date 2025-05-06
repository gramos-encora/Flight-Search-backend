package com.gramos.flight_search.entity;

public class OperatingCarrier {
    private String carrierCode;

    public OperatingCarrier(String carrierCode) {
        this.carrierCode = carrierCode;
    }

    public String getCarrierCode() {
        return carrierCode;
    }

    public void setCarrierCode(String carrierCode) {
        this.carrierCode = carrierCode;
    }
}
