package com.gramos.flight_search.entity;

public class Segment {
    private FlightEndpoint departure;
    private FlightEndpoint arrival;
    private String carrierCode;
    private String number;
    private Aircraft aircraft;
    private OperatingCarrier operating;
    private String duration;
    private String id;
    private int numberOfStops;

    public Segment(FlightEndpoint departure, FlightEndpoint arrival, String carrierCode, String number, Aircraft aircraft, OperatingCarrier operating, String duration, String id, int numberOfStops) {
        this.departure = departure;
        this.arrival = arrival;
        this.carrierCode = carrierCode;
        this.number = number;
        this.aircraft = aircraft;
        this.operating = operating;
        this.duration = duration;
        this.id = id;
        this.numberOfStops = numberOfStops;
    }

    public FlightEndpoint getDeparture() {
        return departure;
    }

    public void setDeparture(FlightEndpoint departure) {
        this.departure = departure;
    }

    public FlightEndpoint getArrival() {
        return arrival;
    }

    public void setArrival(FlightEndpoint arrival) {
        this.arrival = arrival;
    }

    public String getCarrierCode() {
        return carrierCode;
    }

    public void setCarrierCode(String carrierCode) {
        this.carrierCode = carrierCode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    public OperatingCarrier getOperating() {
        return operating;
    }

    public void setOperating(OperatingCarrier operating) {
        this.operating = operating;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNumberOfStops() {
        return numberOfStops;
    }

    public void setNumberOfStops(int numberOfStops) {
        this.numberOfStops = numberOfStops;
    }
}
